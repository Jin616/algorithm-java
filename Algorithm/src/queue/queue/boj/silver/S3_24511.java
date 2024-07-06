package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S3_24511 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		br.readLine(); // n 필요 없음
		String[] queuestack = br.readLine().split(" "); // queue(0) or stack(1)
		String[] boxes = br.readLine().split(" "); // 각 자료 구조 안에 들어가 있는 원소 하나씩
		
		Queue<String> q = new LinkedList<String>(); // 필요 없는 것 거른 통합 큐
		for (int i = queuestack.length - 1; i >= 0; i--)
			if (queuestack[i].equals("0"))
				q.add(boxes[i]);
			
		br.readLine(); // m 필요 없음
		String[] numArray = br.readLine().split(" "); // 수열 C
		StringBuilder sb = new StringBuilder();
		
		for (String num : numArray) { // 수열 C의 수 하나 마다 반복
			q.add(num);
			sb.append(q.poll() + " ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		// br.close();
		// bw.close();
		
	}
	
	static class QueueStack {
		int qs, num;
		
		QueueStack(int qs) {
			
		}
	}
}