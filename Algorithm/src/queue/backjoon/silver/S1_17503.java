package queue.backjoon.silver;

import java.io.*;
import java.util.*;

public class S1_17503 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 첫 줄 읽기
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 기간
		int m = Integer.parseInt(str[1]); // 선호도 합
		int k = Integer.parseInt(str[2]); // 마실 수 있는 맥주 종류 수
		
		// 맥주를 각 도수 레벨을 기준으로 리스트로 만들어 보관
		HashMap<Integer, ArrayList<Integer>> beersMap = new HashMap<Integer, ArrayList<Integer>>();
		
		for (int i = 0; i < k; i++) {
			str = br.readLine().split(" ");
			int like = Integer.parseInt(str[0]); // 선호도 v
			int level = Integer.parseInt(str[1]); // 도수 레벨 c
			
			ArrayList<Integer> beersList = beersMap.get(level);
			
			// 해당하는 레벨에 하나도 없었다면 초기화 후 맵에 넣기
			if (beersList == null) {
				beersList = new ArrayList<Integer>();
				beersMap.put(level, beersList);
			}
			
			beersList.add(like);
		}
		
		int answer = -1;
		// 간 레벨 키 리스트 선언
		ArrayList<Integer> beersLevelKeyList = new ArrayList<>(beersMap.keySet());
		beersLevelKeyList.sort(null);
		// 우선순위 큐 선언
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		// 난이도를 하나씩 올려가며 간 레벨의 최솟값 찾기
		int likeTotal = 0;
		for (int level : beersLevelKeyList) {
			ArrayList<Integer> beersList = beersMap.get(level);
			
			// 하나의 레벨마다 pq에 맥주를 담기
			for (int like : beersList) {
				if (pq.size() == n) // 모든 기간에 먹을 맥주가 다 찼을 때
					likeTotal -= pq.poll(); // pq 헤드에 있는 가장 낮은 선호도를 가진 맥주를 뺌
				
				likeTotal += like;
				pq.add(like);
				
				if (likeTotal >= m && pq.size() == n)
					break ;
			}
			
			if (likeTotal >= m && pq.size() == n) {
				answer = level;
				break ;
			}
		}
		
		bw.write("" + answer);
		bw.flush();
		br.close();
		bw.close();
	}
}