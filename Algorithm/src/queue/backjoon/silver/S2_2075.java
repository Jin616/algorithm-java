package queue.backjoon.silver;

import java.io.*;
import java.util.*;

public class S2_2075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" "))
							.mapToInt(Integer::parseInt)
							.toArray();
			
			PriorityQueue<Integer> tem = new PriorityQueue<Integer>(Collections.reverseOrder());
			tem.addAll(pq);
			
			for (int t : arr)
				tem.add(t);
			
			pq.clear();
			
			for (int j = 0; j < n; j++)
				pq.add(tem.poll());
			
		}
		
		for (int i = 0; i < n - 1; i++)
			pq.poll();
		
		bw.write(String.valueOf(pq.poll()));
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}