package stack.backjoon.silver;

// S5_2751
// https://www.acmicpc.net/problem/2751

import java.io.*;
import java.util.*;

public class S5_2751 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> stack = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++)
			stack.push(Integer.parseInt(br.readLine()));
		
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}