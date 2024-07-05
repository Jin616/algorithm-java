package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S5_11866 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 원탁에 앉은 사람의 수 n
		int k = Integer.parseInt(str[1]); // 몇 번째 k
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		// 초기화
		for (int i = 1; i <= n; i++)
			q.add(i);
		
		// 작동
		bw.write("<");
		while (!q.isEmpty()) {
			for (int i = 0; i < k - 1; i++)
				q.add(q.poll());
			
			bw.write("" + q.poll());
			
			if (q.isEmpty())
				bw.write(">");
			else
				bw.write(", ");
		}
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}