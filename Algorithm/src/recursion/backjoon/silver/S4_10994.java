package recursion.backjoon.silver;

import java.io.*;
import java.util.*;

public class S4_10994 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = (Integer.parseInt(br.readLine()) - 1) * 4 + 1;
		char[][] star = new char[n][n];
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				star[i][j] = ' ';

		mark(star, n);
		
		for (char[] str : star)
			bw.write(new String(str) + "\n");
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static void mark(char[][] star, int n) {
		if (n > 0)
			mark(star, n - 4);
		
		int differ = (star.length - n) / 2;
		
		for (int i = 0 + differ; i < star.length - differ; i++) {
			star[differ][i] = '*';
			star[star.length - 1 - differ][i] = '*';
		}
		
		for (int i = 1 + differ; i < star.length - 1 - differ; i++) {
			star[i][differ] = '*';
			star[i][star.length - 1 - differ] = '*';
		} 
	}
	
}