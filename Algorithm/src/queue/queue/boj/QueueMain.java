package queue.queue.boj;

import java.io.IOException;

import queue.queue.boj.silver.S3_1966;
import queue.queue.boj.silver.S3_24511;
import queue.queue.boj.silver.S4_10845;
import queue.queue.boj.silver.S4_15828;
import queue.queue.boj.silver.S4_18258;
import queue.queue.boj.silver.S4_2164;
import queue.queue.boj.silver.S4_26043;
import queue.queue.boj.silver.S5_11866;
import queue.queue.boj.silver.S5_2161;
import queue.queue.boj.silver.S5_26042;

public class QueueMain {
	
	public static void main(String[] args) throws IOException {
		// silver
		// test11866();
		// test2161();
		// test26042();
		// test2164();
		// test10845();
		// test1158();
		// test18258();
		// test15828();
		// test26043();
		// test1966();
		test24511();
	}

	private static void test24511() throws IOException {
		S3_24511 problem = new S3_24511();
		
		String[] inputs = {
			"4\r\n"
			+ "0 1 1 0\r\n"
			+ "1 2 3 4\r\n"
			+ "3\r\n"
			+ "2 4 7",
			"5\r\n"
			+ "1 1 1 1 1\r\n"
			+ "1 2 3 4 5\r\n"
			+ "3\r\n"
			+ "1 3 5"
		};
		
		String[] outputs = {
			"4 1 2",
			"1 3 5"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test1966() throws IOException {
		S3_1966 problem = new S3_1966();
		
		String[] inputs = {
			"3\r\n"
			+ "1 0\r\n"
			+ "5\r\n"
			+ "4 2\r\n"
			+ "1 2 3 4\r\n"
			+ "6 0\r\n"
			+ "1 1 9 1 1 1"
		};
		
		String[] outputs = {
			"1\r\n"
			+ "2\r\n"
			+ "5"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test26043() throws IOException {
		S4_26043 problem = new S4_26043();
		
		String[] inputs = {
			"6\r\n"
			+ "1 2 1\r\n"
			+ "1 1 1\r\n"
			+ "2 1\r\n"
			+ "1 3 2\r\n"
			+ "2 2\r\n"
			+ "2 2",
			"1\r\n"
			+ "1 1 1",
			"2\r\n"
			+ "1 1 1\r\n"
			+ "2 2"
		};
		
		String[] outputs = {
			"2 3\r\n"
			+ "1\r\n"
			+ "None",
			"None\r\n"
			+ "None\r\n"
			+ "1",
			"None\r\n"
			+ "1\r\n"
			+ "None"
			
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test15828() throws IOException {
		S4_15828 problem = new S4_15828();
		
		String[] inputs = {
			"5\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "3\r\n"
			+ "4\r\n"
			+ "0\r\n"
			+ "5\r\n"
			+ "6\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "-1",
			"1\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "3\r\n"
			+ "4\r\n"
			+ "5\r\n"
			+ "6\r\n"
			+ "7\r\n"
			+ "-1",
			"1\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "3\r\n"
			+ "4\r\n"
			+ "0\r\n"
			+ "5\r\n"
			+ "6\r\n"
			+ "0\r\n"
			+ "7\r\n"
			+ "0\r\n"
			+ "-1"
		};
		
		String[] outputs = {
			"5 6",
			"1",
			"empty"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test18258() throws IOException {
		S4_18258 problem = new S4_18258();
		
		String[] inputs = {
			"15\r\n"
			+ "push 1\r\n"
			+ "push 2\r\n"
			+ "front\r\n"
			+ "back\r\n"
			+ "size\r\n"
			+ "empty\r\n"
			+ "pop\r\n"
			+ "pop\r\n"
			+ "pop\r\n"
			+ "size\r\n"
			+ "empty\r\n"
			+ "pop\r\n"
			+ "push 3\r\n"
			+ "empty\r\n"
			+ "front"
		};
		
		String[] outputs = {
			"1\r\n"
			+ "2\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "3"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test1158() throws IOException {
		S4_15828 problem = new S4_15828();
		
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

	private static void test10845() throws IOException {
		S4_10845 problem = new S4_10845();
		
		String[] inputs = {
			"15\r\n"
			+ "push 1\r\n"
			+ "push 2\r\n"
			+ "front\r\n"
			+ "back\r\n"
			+ "size\r\n"
			+ "empty\r\n"
			+ "pop\r\n"
			+ "pop\r\n"
			+ "pop\r\n"
			+ "size\r\n"
			+ "empty\r\n"
			+ "pop\r\n"
			+ "push 3\r\n"
			+ "empty\r\n"
			+ "front"
		};
		
		String[] outputs = {
			"1\r\n"
			+ "2\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "3"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test2164() throws IOException {
		S4_2164 problem = new S4_2164();
		
		String[] inputs = {
			"6"
		};
		
		String[] outputs = {
			"4"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
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
