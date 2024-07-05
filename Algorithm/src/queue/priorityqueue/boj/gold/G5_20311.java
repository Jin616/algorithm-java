package queue.priorityqueue.boj.gold;

import java.io.*;
import java.util.*;

public class G5_20311 {
	
	static class Plask implements Comparable<Plask> {
		int color, count;
		
		Plask(int color, int count) {
			this.color = color;
			this.count = count;
		}

		@Override
		public int compareTo(Plask other) {
			return other.count - this.count;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(str[0]); // 시험관의 개수 n
		int k = Integer.parseInt(str[1]); // 색깔의 종류 수 k
		
		str = br.readLine().split(" ");
		PriorityQueue<Plask> pqPlask = new PriorityQueue<Plask>();
		// 시약이 많은 순으로 내림차순 정렬
		
		// 입력
		for (int i = 0; i < str.length; i++)
			pqPlask.add(new Plask(i + 1, Integer.parseInt(str[i])));
		
		// 계산
		Plask tem = null; // 따로 빼둘 공간을 tem이라고 정의
		while (!pqPlask.isEmpty()) { // 플라스크가 남아있으면 반복
			Plask plask = pqPlask.poll(); // 하나 뽑고
			
			sb.append(plask.color + " "); // 하나 놓고 써주고
			plask.count--; // 개수 줄이고
			
			if (tem != null) { // 뺴둔 플라스크가 있었다면
				pqPlask.add(tem); // 이제 그 옆에 다른 플라스크가 놓아졌으니 다시 pq에 넣어 주고
				tem = null; // 빼둔 플라스크는 없는 걸로 정의
			}
			
			if (plask.count > 0) // 플라스크의 개수가 아직 남아있다면
				tem = plask; // 따로 빼둠
			
			if (tem != null && pqPlask.isEmpty()) {
				// 여기가 핵심.
				// 따로 빼둔 플라스크는 있는데, 다른 색의 플라스크가 있는 pq에 더 이상의 플라스크가 없다면
				sb = new StringBuilder("-1"); // 실패 출력
				break ;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}
