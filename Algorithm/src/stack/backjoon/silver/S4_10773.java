package stack.backjoon.silver;

import java.io.*;
import java.util.*;

public class S4_10773 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				answer -= stack.pop();
			} else {
				answer += num;
				stack.add(num);
			}
		}
		
		bw.write("" + answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}