package queue.priorityqueue.boj.silver;

import java.io.*;
import java.util.*;

public class S5_1417_3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int output = 0;
		
		Integer dasom = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> list = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 1; i < n; i ++)
			list.add(Integer.parseInt(br.readLine()));
		
		while (!list.isEmpty() && dasom <= list.peek()) {
			output++;
			dasom++;
			
			list.offer(list.poll() - 1);
		}
		
		bw.write(String.valueOf(output));
		bw.flush();
	}
	
}