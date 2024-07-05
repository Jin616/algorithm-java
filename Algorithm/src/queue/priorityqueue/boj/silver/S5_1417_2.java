package queue.priorityqueue.boj.silver;

import java.io.*;
import java.util.*;

public class S5_1417_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int output = 0;
		
		int dasom = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < n; i ++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list, Collections.reverseOrder());
		
		int max = dasom;
		
		while (!list.isEmpty() && dasom <= max) {
			max = list.get(0);
			
			for (int i = 0; i < list.size(); i++) {
				if (max != list.get(i) || dasom > max)
					break;
				
				output++;
				dasom++;
				list.set(i, list.get(i) - 1);
			}
		}
		
		bw.write(String.valueOf(output));
		bw.flush();
	}
	
}
