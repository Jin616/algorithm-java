package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S2_14713 {
	
	static class Parrot {
		Queue<String> words = new LinkedList<String>();

		public Parrot(Queue<String> words) {
			this.words = words;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String answer = "Possible";
		int n = Integer.parseInt(br.readLine());
		
		// 입력
		List<Parrot> parrots = new ArrayList<Parrot>();
		for (int i = 0; i < n; i++)
			parrots.add(new Parrot(new LinkedList<String>(Arrays.asList(br.readLine().split(" ")))));
		
		// 알고리즘
		// 가능한 단어들을 담는 맵
		Map<String, Integer> parrotWordMap = new HashMap<String, Integer>();
		for (Parrot parrot : parrots)
			parrotWordMap.put(parrot.words.poll(), parrots.indexOf(parrot));
		
		for (String word : br.readLine().split(" ")) {
			if (!parrotWordMap.containsKey(word)) {
				answer = "Impossible";
				break ;
			}
			
			Parrot parrot = parrots.get(parrotWordMap.remove(word)); // 단어맵에서 빠진 단어의 앵무새를 찾음
			if (!parrot.words.isEmpty())
				parrotWordMap.put(parrot.words.poll(), parrots.indexOf(parrot)); // 다시 그 앵무새가 말할 수 있는 단어를 맵에 넣음
		}
		
		if (!parrotWordMap.isEmpty())
			answer = "Impossible";
		
		bw.write(answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
	
}