package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S3_12873 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++)
			q.add(i);
		// 기념품 받을 사람 찾기
		int t = 1; // 단계 t = 1
		while (q.size() > 1) {
			int bomb = (int) ((Math.pow(t++, 3) - 1) % q.size());
			
			for (int i = 0; i < bomb; i++) {
				int test = q.poll();
				q.add(test);
			}
			
			q.poll(); // bomb!
		}
		
		bw.write("" + q.poll());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}