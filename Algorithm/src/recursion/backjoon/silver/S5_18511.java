package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S5_18511 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 보다 작아야 하는 n
		int digit = str[0].length(); // n의 자릿수
		
		Integer[] kArr = new Integer[Integer.parseInt(str[1])]; // k의 원소를 담을 배열
		str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++)
			kArr[i] = Integer.parseInt(str[i]);
		
		Arrays.sort(kArr, Collections.reverseOrder());
		
		int[] arr = new int[digit + 1]; // 0번 인덱스에 답을, 1번부턴 각 자리의 숫자
		
		for (int i = 1; i < arr.length; i++)
			arr[i] = kArr[kArr.length - 1];
		
		if (verify(arr, n) > n) {// 같은 자릿수를 가지는 가장 작은 수가 n보다 크다면 자릿수를 하나 줄임
			arr[1] = 0;
			recursion(n, kArr, arr, 2);
		} else { // 같은 자릿수일 경우
			recursion(n, kArr, arr, 1);
		}
		
		bw.write("" + arr[0]);
		bw.flush();
		// br.close();
		// bw.close();
	}

	// 각 자릿수를 합쳐 인트 타입으로 만들어 리턴
	static int verify(int[] arr, int n) { 
		int num = 0;
		for (int i = 1; i < arr.length; i++)
			num = num * 10 + arr[i];
		
		return num;
	}

	/* 각 자릿수들을 인덱스로 접근해 k의 원소로 값을 바꾸고, 끝 인덱스에 도달하면 검증 후 
	 * 조건에 맞다면 1을 리턴하면서 바로 열려 있는 모든 재귀함수를 빠져나옴.
	 * 조건이 틀리다면 0을 리턴하고, 바로 윗계층으로 돌아가 다른 원소 탐색 
	 */
	static int recursion(int n, Integer[] kArr, int[] arr, int i) {
		if (i == arr.length) {
			int num = verify(arr, n);
			
			if (num <= n) {
				arr[0] = num;
				return 1;
			}
			
			return 0;
		}
		
		for (int k : kArr) {
			arr[i] = k;
			
			if (recursion(n, kArr, arr, i + 1) == 1)
				return 1;
		}
		
		return 0;
	}
	
}