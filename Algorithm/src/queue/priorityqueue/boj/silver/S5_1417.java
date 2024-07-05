package queue.priorityqueue.boj.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.PriorityQueue;

public class S5_1417 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int output = 0;
		
		Candidate dasom = new Candidate(1, br.readLine());
		
		PriorityQueue<Candidate> list = new PriorityQueue<Candidate>();
		for (int i = 1; i < n; i ++)
			list.add(new Candidate(i + 1, br.readLine()));
		
		while (!list.isEmpty() && dasom.voter <= list.peek().voter) {
			output++;
			dasom.voter++;
			
			Candidate tem = list.poll();
			tem.voter--;
			list.add(tem);
		}
		
		bw.write(String.valueOf(output));
		bw.flush();
	}
	
	static class Candidate implements Comparable<Candidate> {
		int number;
		int voter;
		
		Candidate(int number, String voter) {
			this.number = number;
			this.voter = Integer.parseInt(voter);
		}
		
		@Override
		public int compareTo(Candidate other) {
			return other.voter - this.voter;
		}
	}
}
