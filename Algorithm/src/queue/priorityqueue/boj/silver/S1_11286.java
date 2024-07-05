package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/11286

import java.io.*;
import java.util.*;

public class S1_11286 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		
		PriorityQueue<Long> pluspq = new PriorityQueue<Long>();
		PriorityQueue<Long> minuspq = new PriorityQueue<Long>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			
			if (num == 0) {
				if (pluspq.isEmpty() && minuspq.isEmpty()) {
					bw.write("0\n");
				} else if (pluspq.isEmpty() && !minuspq.isEmpty()) {
					bw.write(minuspq.poll() + "\n");
				} else if (!pluspq.isEmpty() && minuspq.isEmpty()) {
					bw.write(pluspq.poll() + "\n");
				} else {
					if (pluspq.peek() < Math.abs(minuspq.peek()))
						bw.write(pluspq.poll() + "\n");
					else {
						bw.write(minuspq.poll() + "\n");
					}
				}
			} else if (num > 0){
				pluspq.add(num);
			} else {
				minuspq.add(num);
			}
				
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}