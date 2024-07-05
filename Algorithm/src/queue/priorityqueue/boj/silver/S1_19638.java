package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/19638

import java.io.*;
import java.util.*;

public class S1_19638 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int h = Integer.parseInt(str[1]);
		int t = Integer.parseInt(str[2]);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		// 거인 키 초기화
		for (int i = 0; i < n; i++)
			pq.add(Integer.parseInt(br.readLine()));
		
		// 거인 키 깍기
		int count = 0;
		for (int i = 0; i < t; i++) {
			if (pq.peek() < h || pq.peek() == 1)
				break;

			pq.add(pq.poll() / 2);
			count++;
		}

		bw.write((pq.peek() < h ? "YES\n" + count : "NO\n" + pq.peek()));
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}