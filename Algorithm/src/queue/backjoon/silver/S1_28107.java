package queue.backjoon.silver;

import java.io.*;
import java.util.*;

public class S1_28107 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 손님의 수 n
		// int m = Integer.parseInt(str[1]); // 초밥의 수 m 필요 없어서 주석처리
		int[] counting = new int[n]; // 각 손님이 먹은 초밥의 수 카운팅
		
		Map<Integer, PriorityQueue<Integer>> chobabMap = new HashMap<Integer, PriorityQueue<Integer>>();
		// 손님이 원하는 초밥의 정보가 담겨져 있는 초밥맵, 초밥 인덱스를 key로 하고 그 key를 원하는 손님의 번호가 오름차순으로 pq형태의 value로 들어가 있다.
		for (int i = 0; i < n; i++) { // 손님의 인덱스 i
			str = br.readLine().split(" ");
			
			for (int j = 1; j < str.length; j++) { // 손님의 주문목록 0번째는 몇 개인지 나타내서 제외
				int chobab = Integer.parseInt(str[j]);
				
				if (!chobabMap.containsKey(chobab)) // 처음 들어오는 초밥 번호일 때 초기화
					chobabMap.put(chobab, new PriorityQueue<Integer>());
				
				chobabMap.get(chobab).add(i); // 초밥 번호의 맵에 손님의 인덱스 i를 추가
			}
		}
		
		str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			int chobab = Integer.parseInt(str[i]); // 제공되는 초밥의 번호
			
			if (!chobabMap.containsKey(chobab) || chobabMap.get(chobab).size() == 0)
				continue ; // 초밥맵에 제공되는 초밥의 번호가 있는지 확인 후 없거나, 손님들이 다 먹었으면 패스
			
			counting[chobabMap.get(chobab).poll()]++; // 먹은 손님을 빼고 그걸 바로 카운팅
		}
		
		for (int count : counting)
			bw.write("" + count + " ");
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}