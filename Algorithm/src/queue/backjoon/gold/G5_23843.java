package queue.backjoon.gold;

import java.io.*;
import java.util.*;

public class G5_23843 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		str = br.readLine().split(" ");
		PriorityQueue<Integer> pqTime = new PriorityQueue<Integer>(Collections.reverseOrder()); // 충전할 기기 시간 pq
		for (String time : str)
			pqTime.add(Integer.parseInt(time));
		
		PriorityQueue<Integer> pqConcent = new PriorityQueue<Integer>(m); // 충전 시간 기준 콘센트 pq
		for (int i = 0; i < m; i++) // pqConcent 초기화
			pqConcent.add(0);
			
		while (!pqTime.isEmpty()) // 충전기기 없어질 때까지 반복
			pqConcent.add(pqConcent.poll() + pqTime.poll()); // 빨리 끝난 콘센트에 바로 이어서 충전
		
		while (pqConcent.size() != 1) // 가장 우선순위가 낮은 맥시멈값 뽑기 위해 하나 빼고 다 꺼냄
			pqConcent.poll();
		
		bw.write("" + pqConcent.poll());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}