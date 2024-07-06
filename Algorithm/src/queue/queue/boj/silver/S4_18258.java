package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S4_18258 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		Integer back = null;
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			String order = str[0];
			int output = 0;
			
			if (order.equals("push")) {
				int num = Integer.parseInt(str[1]);
				
				output = -2; // push 했을때 -2로 설정 후 bw에서 출력안 하게 만듦
				q.add(num);
				back = num;
			} else if (order.equals("pop")) {
				output = q.isEmpty() ? -1 : q.poll();
			} else if (order.equals("size")) {
				output = q.size();
			} else if (order.equals("empty")) {
				output = q.isEmpty() ? 1 : 0; 
			} else if (order.equals("front")) {
				output = q.isEmpty() ? -1 : q.peek();
			} else if (order.equals("back")) {
				output = q.isEmpty() ? -1 : back;
			}
			
			if (output != -2)
				bw.write("" + output + "\n");
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}
