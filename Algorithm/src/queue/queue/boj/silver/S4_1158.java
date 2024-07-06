package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S4_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++)
			q.add(i);
		
		bw.write("<");
		while (!q.isEmpty()) {
			for (int i = 0; i < k - 1; i++)
				q.add(q.poll());
			
			bw.write("" + q.poll());
			
			if (!q.isEmpty())
				bw.write(", ");
		}
		bw.write(">");
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}