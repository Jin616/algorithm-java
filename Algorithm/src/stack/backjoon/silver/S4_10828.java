package stack.backjoon.silver;

// https://www.acmicpc.net/problem/10828

import java.io.*;
import java.util.*;

public class S4_10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> stack = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			// push, pop, size, empty, top
			// h, o, i, m, t
			String[] str = br.readLine().split(" ");
			
			if (str[0].equals("push")) {
				stack.push(Integer.parseInt(str[1]));
			} else if (str[0].equals("pop")) {
				if (stack.isEmpty())
					bw.write("-1\n");
				else 
					bw.write("" + stack.pop() + "\n");
			} else if (str[0].equals("size")) {
				bw.write("" + stack.size() + "\n");
			} else if (str[0].equals("empty")) {
				if (stack.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			} else if (str[0].equals("top")) {
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write("" + stack.peek() + "\n");
			}
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}
