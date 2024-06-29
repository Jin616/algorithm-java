package queue.backjoon.silver;

import java.io.*;
import java.util.*;

public class S3_14235 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			int[] gifts = Arrays.stream(br.readLine().split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();
			
			// 0 or not 0
			if (gifts[0] == 0) {
				if (pq.isEmpty())
					bw.write("-1\n");
				else
					bw.write(String.valueOf(pq.poll()) + "\n");
			} else {
				for (int j = 1; j < gifts.length; j++)
					pq.add(gifts[j]);
			}
			
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}