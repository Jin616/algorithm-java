package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S4_15828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String command = br.readLine();
		Queue<String> q = new LinkedList<String>();
		
		while (!command.equals("-1")) {
			if (command.equals("0"))
				q.poll();
			else if (q.size() < n) // size가 n보다 작을 때만 add
				q.add(command);
			
			command = br.readLine();
		}
		
		bw.write(q.isEmpty() ? "empty" : String.join(" ", q));
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}