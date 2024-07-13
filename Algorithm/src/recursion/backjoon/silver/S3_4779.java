package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S3_4779 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		
		while ((str = br.readLine()) != null) {
			int n = (int) Math.pow(3, Integer.parseInt(str));
			
			StringBuilder sb = new StringBuilder();
			
			// recursionV1(sb, 1, n);
			recursionV2(sb, n);
			bw.write(sb.toString() + "\n");
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}

	static void recursionV2(StringBuilder sb, int n) {
		if ((n /= 3) == 0)
			sb.append("-");
		else {
			recursionV2(sb, n);
			
			for (int i = 0; i < n; i++)
				sb.append(" ");
			
			recursionV2(sb, n);
		}
		
	}

	static void recursionV1(StringBuilder sb, int s, int e) {
		// 3등분 후 앞부분 재귀, 중간 빈칸 출력, 뒷부분 재귀
		if (s == e)
			sb.append("-");
		else {
			int gap = e - s + 1; // 닫힌 구간의 개수를 셈
			
			recursionV1(sb, s, s + gap / 3 - 1); // s 1 e 9 일땐 1과 3을 보냄
			
			for (int i = 0; i < gap / 3; i++)
				sb.append(" ");
			
			recursionV1(sb, e - gap / 3 + 1, e); // s1 e 9 일땐 7과 9를 보냄
		}
	}
	
}