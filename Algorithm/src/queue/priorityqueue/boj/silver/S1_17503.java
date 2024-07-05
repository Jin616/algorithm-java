package queue.priorityqueue.boj.silver;

import java.io.*;
import java.util.*;

public class S1_17503 {
	
	public static class Beer implements Comparable<Beer> {
		int like, level;
		
		Beer(int like, int level) {
			this.like = like;
			this.level = level;
		}

		@Override
		public int compareTo(Beer o) {
			return this.level == o.level ? o.like - this.like : this.level - o.level;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int period = Integer.parseInt(str[0]); // 기간 n
		int	targetLike = Integer.parseInt(str[1]); // 선호도 합 m
		int kind = Integer.parseInt(str[2]); // 마실 수 있는 맥주 종류 수 k
		
		PriorityQueue<Beer> pqBeer = new PriorityQueue<Beer>();
		
		for (int i = 0; i < kind; i++) {
			str = br.readLine().split(" ");
			
			pqBeer.add(new Beer(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
		}
		
		int answer = -1; // 불가일 때 -1
		int likeTotal = 0;
		PriorityQueue<Integer> pqTem = new PriorityQueue<Integer>(); // 가장 선호도가 낮은 맥주를 빼기 위한 임시 pq 설정
		
		while (!pqBeer.isEmpty()) {
			Beer beer = pqBeer.poll();
			
			likeTotal += beer.like;
			pqTem.add(beer.like);
			
			if (pqTem.size() > period) // 모든 기간에 먹을 맥주가 다 찼을 때
				likeTotal -= pqTem.poll(); // pq 헤드에 있는 가장 낮은 선호도를 가진 맥주를 뺌
			
			if (likeTotal >= targetLike && pqTem.size() == period) {
				answer = beer.level;
				break ;
			}
		}
		
		bw.write("" + answer);
		bw.flush();
//		br.close();
//		bw.close();
	}
}