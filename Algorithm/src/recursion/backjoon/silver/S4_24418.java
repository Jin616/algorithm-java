package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S4_24418 {
	static int recursionCount;
	static int dynamicCount;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		int n = Integer.parseInt(br.readLine());
		
		int[][] m = new int[n + 1][n + 1]; // 초기값 0인 배열 선언
		for (int i = 1; i <= n; i++) {
			String[] str = br.readLine().split(" ");
			
			for (int j = 1; j <= n; j++)
				m[i][j] = Integer.parseInt(str[j - 1]);
		}
		
		// 테스트 코드
		/*int recursiveAnswer = */recursion(m, n, n);
		/*int dynamicAnswer = */dynamicPrograming(m, n);
//		bw.write("test\nrecursive : " + recursiveAnswer + "\ndynamic : " + dynamicAnswer + "\n");
		
		bw.write("" + recursionCount + " " + dynamicCount);
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static int dynamicPrograming(int[][] m, int n) {
		int[][] d = new int[n + 1][n + 1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				d[i][j] = m[i][j] + Math.max(d[i - 1][j], d[i][j - 1]);
				dynamicCount++;
			}
		}

		return d[n][n];
	}

	private static int recursion(int[][] m, int i, int j) {
		if (i == 0 || j == 0) {
			recursionCount++;
			return 0;
		} else {
			return m[i][j] + Math.max(recursion(m, i - 1, j), recursion(m, i, j - 1));
		}
	}

	
}