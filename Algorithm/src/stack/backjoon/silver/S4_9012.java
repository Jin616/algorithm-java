package stack.backjoon.silver;

import java.io.*;
import java.util.*;

public class S4_9012 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			char[] str = br.readLine().toCharArray();
			if (str.length % 2 == 1) {
				bw.write("NO\n");
				continue ;
			}
			
			String answer = "YES\n";
			Stack<Character> stack = new Stack<Character>();
			
			for (int j = 0; j < str.length; j++) {
				if (stack.isEmpty() && isClosed(str[j])) {
					answer = "NO\n";
					break ;
				} else if (isClosed(str[j])) {
					stack.pop();
				} else {
					stack.add(str[j]);
				}
			}
			
			if (stack.size() != 0)
				answer = "NO\n";
			
			bw.write(answer);
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static boolean isClosed(char c) {
		return c == ')';
	}
	
}