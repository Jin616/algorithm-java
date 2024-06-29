package stack.backjoon;

import java.io.IOException;

import stack.backjoon.silver.S4_10773;
import stack.backjoon.silver.S4_10828;
import stack.backjoon.silver.S4_9012;
import stack.backjoon.silver.S5_2751;

public class StackMain {
	
	public static void main(String[] args) throws IOException {
//		test2751();
//		test10828();
//		test9012();
		test10773();
	}
	
	private static void test10773() throws IOException {
		S4_10773 problem = new S4_10773();
		
		String[] inputs = {
			"4\r\n"
			+ "3\r\n"
			+ "0\r\n"
			+ "4\r\n"
			+ "0",
			"10\r\n"
			+ "1\r\n"
			+ "3\r\n"
			+ "5\r\n"
			+ "4\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "7\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "6"
		};
		
		String[] outputs = {
			"0",
			"7"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test9012() throws IOException {
		S4_9012 problem = new S4_9012();
		
		String[] inputs = {
			"6\r\n"
			+ "(())())\r\n"
			+ "(((()())()\r\n"
			+ "(()())((()))\r\n"
			+ "((()()(()))(((())))()\r\n"
			+ "()()()()(()()())()\r\n"
			+ "(()((())()(",
			"3\r\n"
			+ "((\r\n"
			+ "))\r\n"
			+ "())(()"
		};
		
		String[] outputs = {
			"NO\r\n"
			+ "NO\r\n"
			+ "YES\r\n"
			+ "NO\r\n"
			+ "YES\r\n"
			+ "NO",
			"NO\r\n"
			+ "NO\r\n"
			+ "NO"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test10828() throws IOException {
		S4_10828 problem = new S4_10828();
		
		String[] inputs = {
				"14\r\n"
				+ "push 1\r\n"
				+ "push 2\r\n"
				+ "top\r\n"
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
				+ "top",
				"7\r\n"
				+ "pop\r\n"
				+ "top\r\n"
				+ "push 123\r\n"
				+ "top\r\n"
				+ "pop\r\n"
				+ "top\r\n"
				+ "pop"
			};
			
			String[] outputs = {
				"2\r\n"
				+ "2\r\n"
				+ "0\r\n"
				+ "2\r\n"
				+ "1\r\n"
				+ "-1\r\n"
				+ "0\r\n"
				+ "1\r\n"
				+ "-1\r\n"
				+ "0\r\n"
				+ "3",
				"-1\r\n"
				+ "-1\r\n"
				+ "123\r\n"
				+ "123\r\n"
				+ "-1\r\n"
				+ "-1"
			};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test2751() throws IOException {
		S5_2751 problem = new S5_2751();
		
		String[] inputs = {
			"14\r\n"
			+ "push 1\r\n"
			+ "push 2\r\n"
			+ "top\r\n"
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
			+ "top",
			"7\r\n"
			+ "pop\r\n"
			+ "top\r\n"
			+ "push 123\r\n"
			+ "top\r\n"
			+ "pop\r\n"
			+ "top\r\n"
			+ "pop"
		};
		
		String[] outputs = {
			"2\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "2\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "3",
			"-1\r\n"
			+ "-1\r\n"
			+ "123\r\n"
			+ "123\r\n"
			+ "-1\r\n"
			+ "-1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
}
