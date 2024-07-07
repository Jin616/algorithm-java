package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S2_28066 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++)
			q.add(i); // 청설모 추가
		
		while (q.size() > 1) {
			q.add(q.poll()); // 처음 청설모 살려줌
			
			for (int i = 0; i < k - 1 && q.size() > 1; i++)
				q.poll(); // 청설모 죽어라
		}
		
		bw.write("" + q.poll());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}