package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S5_2161 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++)
			q.add(i);
		
		while (!q.isEmpty()) {
			bw.write("" + q.poll() + " ");
			
			if (!q.isEmpty()) 
				q.add(q.poll());
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}