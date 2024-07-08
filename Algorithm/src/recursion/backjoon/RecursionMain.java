package recursion.backjoon;

import java.io.IOException;

import recursion.backjoon.silver.S4_10994;

public class RecursionMain {

	public static void main(String[] args) throws IOException {
		test10994();
	}

	private static void test10994() throws IOException {
		S4_10994 problem = new S4_10994();
		
		String[] inputs = {
			"1",
			"2",
			"3",
			"4"
		};
		
		String[] outputs = {
			"*",
			"*****\r\n"
			+ "*   *\r\n"
			+ "* * *\r\n"
			+ "*   *\r\n"
			+ "*****",
			"*********\r\n"
			+ "*       *\r\n"
			+ "* ***** *\r\n"
			+ "* *   * *\r\n"
			+ "* * * * *\r\n"
			+ "* *   * *\r\n"
			+ "* ***** *\r\n"
			+ "*       *\r\n"
			+ "*********",
			"*************\r\n"
			+ "*           *\r\n"
			+ "* ********* *\r\n"
			+ "* *       * *\r\n"
			+ "* * ***** * *\r\n"
			+ "* * *   * * *\r\n"
			+ "* * * * * * *\r\n"
			+ "* * *   * * *\r\n"
			+ "* * ***** * *\r\n"
			+ "* *       * *\r\n"
			+ "* ********* *\r\n"
			+ "*           *\r\n"
			+ "*************"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
	}
	
}
