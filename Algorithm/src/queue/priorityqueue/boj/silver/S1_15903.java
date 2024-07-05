package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/15903

import java.io.*;
import java.util.*;

public class S1_15903 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		long m = Integer.parseInt(str[1]);
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		// 카드 초기화
		str = br.readLine().split(" ");
			
		for (String s : str)
			pq.add(Long.parseLong(s));
		
		
		// m번 카드 합체
		for (long i = 0; i < m; i++) {
			long x = pq.poll();
			long y = pq.poll();
			
			x += y;

			pq.add(x);
			pq.add(x);
		}
		
		// 값 계산
		long answer = 0;
		while (!pq.isEmpty())
			answer += pq.poll();
		
		bw.write("" + answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}