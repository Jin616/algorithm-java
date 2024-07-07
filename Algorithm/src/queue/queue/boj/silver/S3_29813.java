package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S3_29813 {
	
	static class Trash {
		String name;
		int likeTrash;
		
		public Trash(String name, String likeTrash) {
			this.name = name;
			this.likeTrash = Integer.parseInt(likeTrash);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 입력
		Queue<Trash> q = new LinkedList<Trash>();
		while (n-- > 0) {
			String[] line = br.readLine().split(" ");
			
			q.add(new Trash(line[0], line[1]));
		}
		
		// 알고리즘
		while (q.size() > 1) {
			Trash trash = q.poll(); // 가장 앞에 선 쓰레기가 하나 뽑고
			
			for (int i = 0; i < trash.likeTrash - 1; i++)
				q.add(q.poll()); // 패스 후 뒤로 보내기
			
			q.poll(); // 그 쓰레기의 짝꿍 또 하나 뽑음
		}
		
		bw.write(q.poll().name);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}