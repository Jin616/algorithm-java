package queue.backjoon.gold;

import java.io.*;
import java.util.*;

public class G5_21773 {
	
	static class Process implements Comparable<Process> {
		int id, time, priority;
		
		Process(String id, String time, String priority) {
			this.id = Integer.parseInt(id);
			this.time = Integer.parseInt(time);
			this.priority = Integer.parseInt(priority);
		}

		@Override
		public int compareTo(Process other) {
			return this.priority != other.priority ?
					other.priority - this.priority : this.id - other.id;
		}

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int t = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		PriorityQueue<Process> pqProcess = new PriorityQueue<Process>();
		// 문제의 우선순위대로 설정된 Process pq를 만듦
		
		// 입력
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			
			pqProcess.add(new Process(str[0], str[1], str[2]));
		}
		
		// pq에 남은 작업이 있는 동안 반복
		while (!pqProcess.isEmpty()) {
			Process p = pqProcess.poll();
			bw.write("" + p.id + "\n");
			if (--t == 0) // 출력할 T 줄이 다 찼다면 종료
				break ;
			
			if (--p.time == 0) //  p.time을 전위 연산으로 미리 뺀 후 0으로 끝났다면
				continue; // 
			
			--p.priority; // 다른 프로세스들의 우선순위를 높이기 보단 해당 프로세스의 우선순위를 낮추기로 함
			pqProcess.add(p);
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}