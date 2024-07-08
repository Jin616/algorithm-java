package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S1_13335 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String[] str = br.readLine().split(" ");
		// int n = Integer.parseInt(str[0]); // 트럭의 수 n
		int w = Integer.parseInt(str[1]); // 다리의 길이 w
		int l = Integer.parseInt(str[2]); // 다리의 최대하중 l
		
		Queue<Integer> qTruck = new LinkedList<Integer>();
		Queue<Integer> qBridge = new LinkedList<Integer>();
		
		for (String weight : br.readLine().split(" "))
			qTruck.add(Integer.parseInt(weight));
		
		for (int i = 0; i < w; i++)
			qBridge.add(0); // 다리 위 무게 0인 트럭으로 가득 채움
		
		// 알고리즘
		int bridgeTruckTotalWeight = 0; // 다리 위에 있는 트럭들의 무게 합
		int time = 0; // 걸린 시간
		
		while (!qTruck.isEmpty() || !qBridge.isEmpty()) { // 트럭과 다리 큐 둘 다 빌 때까지 반복 
			bridgeTruckTotalWeight -= qBridge.poll(); // 다리에서 하나 빼면서 무게 계산
			
			if (!qTruck.isEmpty()) {
				int nextTruckWeight = qTruck.peek();
				
				if (nextTruckWeight + bridgeTruckTotalWeight <= l) { // 다리에 트럭이 올라갈 수 있으면
					qBridge.add(qTruck.poll()); // 대기중이었던 트럭 한 대를 다리 위에 올림
					bridgeTruckTotalWeight += nextTruckWeight;
				} else { // 만약 못 올라간다면 빈칸으로 두기 위해
					qBridge.add(0); // 무게가 0인 트럭을 올려줌
				}
			}
			time++; // 걸린 시간 측정
		}
		
		bw.write("" + time);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}