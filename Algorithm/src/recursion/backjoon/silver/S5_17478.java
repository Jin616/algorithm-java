package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S5_17478 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String[] recursionStr = {
				"어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.",
				"\"재귀함수가 뭔가요?\"",
				"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
				"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
				"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",
				"\"재귀함수는 자기 자신을 호출하는 함수라네\"",
				"라고 답변하였지."
		};
		recursion(sb, recursionStr, n, 0);
		
		bw.write(sb.toString());
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static void recursion(StringBuilder sb, String[] recursionStr, int n, int idx) {
		if (idx == 0)
			printWithUnderbar(sb, recursionStr[0], 0);
		
		if (idx == n) {
			printWithUnderbar(sb, recursionStr[1], 4 * n);
			printWithUnderbar(sb, recursionStr[5], 4 * n);
			printWithUnderbar(sb, recursionStr[6], 4 * n);
		} else {
			for (int i = 1; i <= 4; i++)
				printWithUnderbar(sb, recursionStr[i], 4 * idx);
			
			recursion(sb, recursionStr, n, idx + 1);
			printWithUnderbar(sb, recursionStr[6], 4 * idx);
		}
		
	}

	static void printWithUnderbar(StringBuilder sb, String str, int n) {
		while (n-- > 0)
			sb.append("_");
		sb.append(str + "\n");
	}
	
}