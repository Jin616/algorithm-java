package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S3_28075 {
	static int[] satisfaction; // 만족도를 저장할 배열
	static int[][] place; // 장소의 정보
	static int n, m; // 일 수 n과 요구 만족도 m
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String[] str = br.readLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		String[] collection = br.readLine().split(" ");
		String[] detect = br.readLine().split(" ");
		
		place = new int[collection.length][2];
		for (int i = 0; i < 3; i++) {
			place[i][0] = Integer.parseInt(collection[i]);
			place[i][1] = Integer.parseInt(detect[i]);
		}
		
		satisfaction = new int[n + 1];
		
		recursion(1, -1);
		bw.write("" + satisfaction[0]);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
	// 현재 몇일차인지, 직전 장소가 어디었는지 입력을 받음
	static void recursion(int day, int before) {
		if (day > n) {// 날짜가 지났다면
			int sum = 0;
			
			for (int i = 1; i < satisfaction.length; i++)
				sum += satisfaction[i];
			
			if (sum >= m)
				satisfaction[0]++;
			
			return ; // 재귀 끝맺음
		}
		
		for (int i = 0; i < place.length; i++) {
			for (int j = 0; j < place[i].length; j++) {
				satisfaction[day] = place[i][j]; // 방문한 장소의 만족도를 추가
				
				if (i == before) // 전일 방문한 곳과 같다면
					satisfaction[day] = place[i][j] / 2; // 절반 값
				
				recursion(day + 1, i); // 하루를 더하고, 지금 방문한 장소의 인덱스를 넘겨줌
			}
		}
	}
	
}