package queue.backjoon.silver;

import java.io.*;
import java.util.*;

public class S2_23757 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.readLine();
		String[] boxGifts = br.readLine().split(" ");
		int[] childGifts =  Arrays.stream(br.readLine().split(" "))
								.mapToInt(Integer::parseInt)
								.toArray();;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (String gift : boxGifts)
			pq.add(Integer.parseInt(gift));
		
		int answer = 1;
		
		for (int childGift : childGifts) {
			int boxGift = pq.poll();
			
			if (childGift > boxGift) {
				answer = 0;
				break;
			}
			
			pq.add(boxGift - childGift);
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}