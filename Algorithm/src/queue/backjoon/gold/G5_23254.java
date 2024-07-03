package queue.backjoon.gold;

import java.io.*;
import java.util.*;

public class G5_23254 { 
	
	static class Subject implements Comparable<Subject> {
		int score, plusScore;
		
		Subject(String score, String plusScore) {
			this.score = Integer.parseInt(score);
			this.plusScore = Integer.parseInt(plusScore);
			
			if (100 - this.score < this.plusScore) // 더 공부해봤자 쓸모가 없으면
				this.plusScore = 100 - this.score; // 우선순위를 낮추게 추가 점수 조정
		}

		@Override
		public int compareTo(Subject other) {
			return other.plusScore - this.plusScore;
		}

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int answer = 0;
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]) * 24; // 시간 n * 24
		int m = Integer.parseInt(str[1]); // 과목 수 m
		
		// 입력
		String[] scores = br.readLine().split(" ");
		String[] plusScores = br.readLine().split(" ");
		PriorityQueue<Subject> pqSubject = new PriorityQueue<Subject>();
		
		for (int i = 0; i < m; i++)
			pqSubject.add(new Subject(scores[i], plusScores[i]));
		
		// 공부
		while (!pqSubject.isEmpty() && n > 0) { // 아직 공부할 과목이 남거나 공부할 시간이 없거나
			Subject subject = pqSubject.poll();
			
			n--; // 한 시간 공부
			subject.score += subject.plusScore; // 한시간만큼 +
			if (subject.score >= 100) { // 백점을 초과해도 백점밖에 못 얻음으로
				answer += 100; // 백점을 더해주고
				continue ; // pq에 다시 안 넣고 다음 공부하러 넘어감
			}
			
			if (100 - subject.score < subject.plusScore) // 더 공부해봤자 쓸모가 없으면
				subject.plusScore = 100 - subject.score; // 우선순위를 낮추게 추가 점수 조정
			
			pqSubject.add(subject); // 다시 pq에 add
		}
		
		while (!pqSubject.isEmpty()) // 100점은 아니지만 그래도 남은 과목들 더해줌
			answer += pqSubject.poll().score;
		
		bw.write("" + answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}