package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S5_26042 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int last = Integer.MAX_VALUE;
		int maxSize = 0;
		
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			if (str[0].equals("1")) {
				int student = Integer.parseInt(str[1]);
				q.add(student);
				
				if (q.size() > maxSize || (q.size() == maxSize && student < last)) {
					maxSize = q.size();
					last = student;
				}
			} else {
				q.poll();
			}
				
		}
		
		bw.write("" + maxSize + " " + last);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}