package queue.queue.boj;

import java.io.IOException;

import queue.priorityqueue.boj.silver.S5_1417;

public class QueueMain {
	
	public static void main(String[] args) throws IOException {
		// silver
		test11866();
//		test2161();
//		test26042();
//		test2164();
//		test10845();
//		test1158();
//		test18258();
//		test15828(;)
//		test26043();
	}

	private static void test11866() throws IOException {
		S5_1417 problem = new S5_1417();
		
		String[] inputs = {
			
		};
		
		String[] outputs = {
			
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	
}
