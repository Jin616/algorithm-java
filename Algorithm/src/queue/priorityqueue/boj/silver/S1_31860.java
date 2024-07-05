package queue.priorityqueue.boj.silver;

// https://www.acmicpc.net/problem/31860

import java.io.*;
import java.util.*;

public class S1_31860 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 일의 개수 n
		int m = Integer.parseInt(str[1]); // 하루에 처리하는 중요도 m
		int k = Integer.parseInt(str[2]); // 완료한 것 최대값 k
		
		PriorityQueue<Integer> pqWorks = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		for (int i = 0; i < n; i++)
			pqWorks.add(Integer.parseInt(br.readLine()));
		
		List<Integer> satisfiedList = new ArrayList<Integer>();
		
		int satisfied = 0;
		while (!pqWorks.isEmpty()) {
			int work = pqWorks.poll();
			
			satisfied = satisfied / 2 + work;
			satisfiedList.add(satisfied);
			work -= m;
			
			if (work > k)
				pqWorks.add(work);
		}
		
		bw.write("" + satisfiedList.size());
		for (int i : satisfiedList) {
			bw.write("\n" + i);
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}