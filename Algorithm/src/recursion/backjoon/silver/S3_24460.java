package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S3_24460 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			for (int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(str[j]);
		}
		
		bw.write("" + recursion(arr, 0, arr.length, 0, arr.length));
		bw.flush();
		// br.close();
		// bw.close();
	}

	static int recursion(int[][] arr, int s1, int e1, int s2, int e2) {
		if (e1 - s1 == 1) { // 차이가 1이란 건 범위 안에 e1 < i < s1 를 만족하는
			return arr[s1][s2]; // s1 인덱스 값을 리턴
		} else {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			
			int mid1 = s1 + (e1 - s1) / 2, mid2 = s2 + (e2 - s2) / 2; 
			
			pq.add(recursion(arr, s1, mid1, s2, mid2));
			pq.add(recursion(arr, mid1, e1, s2, mid2));
			pq.add(recursion(arr, s1, mid1, mid2, e2));
			pq.add(recursion(arr, mid1, e1, mid2, e2));
			
			pq.poll();
			return pq.poll(); // 두번째 값을 원하니 두번째 poll한 값을 리턴
		}
	}
	
}