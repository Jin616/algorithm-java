package queue.priorityqueue.boj.gold;

import java.io.*;
import java.util.*;

public class G5_1374 {
	
	static class Lesson implements Comparable<Lesson> {
		int start, end;

		Lesson(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		@Override
		public int compareTo(Lesson other) {
			return this.start - other.start; // 시작 시간순 오름차순 정렬
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Lesson> pqStartTime = new PriorityQueue<Lesson>(); // 한 줄마다 강의를 Lesson 객체로 생성
		
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			pqStartTime.add(new Lesson(Integer.parseInt(str[1]), Integer.parseInt(str[2]) - 1)); // e에서 1을 빼줘서 관리
		}
		
		PriorityQueue<Integer> pqEndTime = new PriorityQueue<Integer>(); // e 즉 endtime을 기준으로 할 pq 새로 선언
		
		pqEndTime.add(pqStartTime.poll().end); // 초기값 하나 == 강의실 생성. while문 안에서 분기로 넣어줘도 되지만 문제에서 n이 1이 보장되기에 이렇게 했음
		
		while (pqStartTime.size() != 0) { // 강의 목록이 있는 동안 반복
			Lesson lesson = pqStartTime.poll(); // 강의 목록에서 하나를 꺼내서
			
			if (pqEndTime.peek() < lesson.start) // 기존 강의실 목록에서 가장 빨리 끝나는 강의와 비교하고
				pqEndTime.poll(); // 그 강의실에 넣기 위해 뺀다
			
			pqEndTime.add(lesson.end); // 새 강의실을 추가하던, 기존 강의실을 갱신하던 같은 코드
		}

		bw.write("" + pqEndTime.size());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}