package queue.priorityqueue.boj.gold;

import java.io.*;
import java.util.*;

public class G5_22252 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int q = Integer.parseInt(br.readLine()); // query
		long answer = 0L;
		Map<String, PriorityQueue<Integer>> infoMap = new HashMap<String, PriorityQueue<Integer>>();
		// 고릴라들의 이름을 키로, 정보들의 pq가 value로 담긴 infoMap 선언
		
		for (int i = 0; i < q; i++) {
			String[] str = br.readLine().split(" ");
			
			int order = Integer.parseInt(str[0]);
			String name = str[1];
			
			if (order == 1) { // 고릴라가 가진 정보 추가
				if (!infoMap.containsKey(name)) // 정보맵에 고릴라가 없으면
					infoMap.put(name, new PriorityQueue<Integer>(Collections.reverseOrder()));
					// pq 초기화 생성해서 넣어줌
				
				PriorityQueue<Integer> pqInfo = infoMap.get(name);
				// 고릴라에 대한 정보 pq 주소를 가져와 정보를 집어 넣는 for 문 실행
				// 한 줄마다 인덱스를 앞에 0, 1번을 쓰고 
				// 2번 인덱스 이후 남는 것이 전부 정보의 가치들이므로
				// 아래와 같이 인자 설정
				
				for (int j = 3; j < str.length; j++)
					pqInfo.add(Integer.parseInt(str[j]));
				
			} else if (order == 2){ // 고릴라에게서 정보 사기
				PriorityQueue<Integer> pqInfo = infoMap.get(name);
				
				int n = Integer.parseInt(str[2]); // 몇 개 살건지 선언
				// 고릴라가 정보를 갖고 있고, 개수가 남아 있다면 계속 꺼내서 더하는 과정을 반복
				while (pqInfo != null && !pqInfo.isEmpty() && n-- > 0)
					answer += pqInfo.poll();
				
			}
				
		}
		
		bw.write("" + answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}
