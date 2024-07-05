package queue.queue.boj;

import java.io.IOException;

import queue.queue.boj.silver.S5_11866;
import queue.queue.boj.silver.S5_2161;
import queue.queue.boj.silver.S5_26042;

public class QueueMain {
	
	public static void main(String[] args) throws IOException {
		// silver
		// test11866();
		// test2161();
		test26042();
//		test2164();
//		test10845();
//		test1158();
//		test18258();
//		test15828(;)
//		test26043();
	}

	private static void test26042() throws IOException {
		S5_26042 problem = new S5_26042();
		
		String[] inputs = {
			"5\r\n"
			+ "1 2\r\n"
			+ "1 1\r\n"
			+ "2\r\n"
			+ "1 3\r\n"
			+ "2"
		};
		
		String[] outputs = {
			"2 1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test2161() throws IOException {
		S5_2161 problem = new S5_2161();
		
		String[] inputs = {
			"7"
		};
		
		String[] outputs = {
			"1 3 5 7 4 2 6"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test11866() throws IOException {
		S5_11866 problem = new S5_11866();
		
		String[] inputs = {
			"7 3"
		};
		
		String[] outputs = {
			"<3, 6, 2, 7, 5, 1, 4>"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	
}
