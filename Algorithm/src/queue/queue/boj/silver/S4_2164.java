package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S4_2164 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++)
			q.add(i);
		
		while (q.size() > 1) {
			q.poll();
			q.add(q.poll());
		}
		
		bw.write("" + q.poll());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}