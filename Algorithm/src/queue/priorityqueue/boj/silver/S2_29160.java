package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/29160

import java.io.*;
import java.util.*;

public class S2_29160 {
	static List<PriorityQueue<Integer>> players = new ArrayList<PriorityQueue<Integer>>();
	static int[] lineup = new int[11];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		// 11개의 우선순위 큐 생성 및 list에 넣기
		for (int i = 0; i < lineup.length; i++)
			players.add(new PriorityQueue<Integer>(Collections.reverseOrder()));

		// 선수 넣기
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			
			int position = Integer.parseInt(str[0]);
			int value = Integer.parseInt(str[1]);
			
			players.get(position - 1).add(value);
		}
		
		// K년이 될 때까지 반복
		for (int i = 1; i <= k; i++) {
			// 3월 과정 진행
			sellect();
			
			// 8월 과정 진행
			for (int j = 0; j < lineup.length; j++)
				if (lineup[j] > 0)
					lineup[j]--;
			
			// 11월
			sellect();
		}
		
		
		// 가치 합산
		int answer = 0;
		for (int w : lineup) 
			answer += w;
			
		bw.write(String.valueOf(answer));
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static void sellect() {
		for (int i = 0; i < lineup.length; i++) {
			PriorityQueue<Integer> pq = players.get(i);
			
			if (pq.isEmpty())
				continue;
			
			if (pq.peek() > lineup[i]) {
				pq.add(lineup[i]);
				lineup[i] = pq.poll();
			}
		}
	}
	
}