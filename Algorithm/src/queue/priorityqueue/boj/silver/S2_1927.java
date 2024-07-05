package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/1927

import java.io.*;
import java.util.*;

public class S2_1927 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		for (int i = 0; i < n; i++) {
			long x = Long.parseLong(br.readLine());
			
			if (x == 0) {
				if (pq.isEmpty())
					bw.write("0\n");
				else
					bw.write(pq.poll() + "\n");
			} else {
				pq.add(x);
			}
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}
