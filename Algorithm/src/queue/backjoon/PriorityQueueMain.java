package queue.backjoon;

import java.io.IOException;

import queue.backjoon.gold.G5_11000;
import queue.backjoon.gold.G5_1374;
import queue.backjoon.gold.G5_19598;
import queue.backjoon.gold.G5_22252;
import queue.backjoon.gold.G5_23843;
import queue.backjoon.silver.S1_11286;
import queue.backjoon.silver.S1_15903;
import queue.backjoon.silver.S1_17503;
import queue.backjoon.silver.S1_19638;
import queue.backjoon.silver.S1_28107;
import queue.backjoon.silver.S1_31860;
import queue.backjoon.silver.S2_11279;
import queue.backjoon.silver.S2_1927;
import queue.backjoon.silver.S2_2075;
import queue.backjoon.silver.S2_23757;
import queue.backjoon.silver.S2_29160;
import queue.backjoon.silver.S3_14235;
import queue.backjoon.silver.S5_1417_3;

public class PriorityQueueMain {
	
	public static void main(String[] args) throws IOException {
		// silver
		// test1417();
		// test14235();
		// test1927();
		// test11279();
		// test2075();
		// test29160();
		// test11286();
		// test15903();
		// test19638();
		// test17503();
		// test23757();
		// test28107();
		// test31860();
		
		// gold
		// test11000();
		// test1374();
		// test19598();
		// test23843();
		test22252();
	}
	
	private static void test22252() throws IOException {
		G5_22252 problem = new G5_22252();
		
		String[] inputs = {
			"7\r\n"
			+ "1 Cpp 5 10 4 2 8 4\r\n"
			+ "1 Java 2 8 2\r\n"
			+ "2 Cpp 2\r\n"
			+ "1 Cpp 2 10 3\r\n"
			+ "2 Cpp 3\r\n"
			+ "2 Java 1\r\n"
			+ "2 Python 10"
		};
		
		String[] outputs = {
			"44"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test23843() throws IOException {
		G5_23843 problem = new G5_23843();
		
		String[] inputs = {
			"5 2\r\n"
			+ "1 4 4 8 1"
		};
		
		String[] outputs = {
			"9"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test19598() throws IOException {
		G5_19598 problem = new G5_19598();
		
		String[] inputs = {
			"3\r\n"
			+ "0 40\r\n"
			+ "15 30\r\n"
			+ "5 10",
			"2\r\n"
			+ "10 20\r\n"
			+ "5 10"
		};
		
		String[] outputs = {
			"2",
			"1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test1374() throws IOException {
		G5_1374 problem = new G5_1374();
		
		String[] inputs = {
			"8\r\n"
			+ "6 15 21\r\n"
			+ "7 20 25\r\n"
			+ "1 3 8\r\n"
			+ "3 2 14\r\n"
			+ "8 6 27\r\n"
			+ "2 7 13\r\n"
			+ "4 12 18\r\n"
			+ "5 6 20"
		};
		
		String[] outputs = {
			"5"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test11000() throws IOException {
		G5_11000 problem = new G5_11000();
		
		String[] inputs = {
			"3\r\n"
			+ "1 3\r\n"
			+ "2 4\r\n"
			+ "3 5"
		};
		
		String[] outputs = {
			"2"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test31860() throws IOException {
		S1_31860 problem = new S1_31860();
		
		String[] inputs = {
			"2 5 3\r\n"
			+ "10\r\n"
			+ "18"
		};
		
		String[] outputs = {
			"5\r\n"
			+ "18\r\n"
			+ "22\r\n"
			+ "21\r\n"
			+ "18\r\n"
			+ "14"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test28107() throws IOException {
		S1_28107 problem = new S1_28107();
		
		String[] inputs = {
			"3 5\r\n"
			+ "2 1 6\r\n"
			+ "3 2 3 5\r\n"
			+ "1 1\r\n"
			+ "3 2 1 4 5"
		};
		
		String[] outputs = {
			"1 3 0"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test17503() throws IOException {
		S1_17503 problem = new S1_17503();
		
		String[] inputs = {
			"3 9 5\r\n"
			+ "1 4\r\n"
			+ "2 5\r\n"
			+ "3 3\r\n"
			+ "4 3\r\n"
			+ "4 6",
			"1 100 2\r\n"
			+ "99 10\r\n"
			+ "99 10"
		};
		
		String[] outputs = {
			"5",
			"-1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test19638() throws IOException {
		S1_19638 problem = new S1_19638();
		
		String[] inputs = {
			"1 10 1\r\n"
			+ "20",
			"2 10 3\r\n"
			+ "16\r\n"
			+ "32",
			"2 10 3\r\n"
			+ "127\r\n"
			+ "8",
			"1 1 100000\r\n"
			+ "1",
			"1 1 1\r\n"
			+ "1"
		};
		
		String[] outputs = {
			"NO\r\n"
			+ "10",
			"YES\r\n"
			+ "3",
			"NO\r\n"
			+ "15",
			"NO\r\n"
			+ "1",
			"NO\r\n"
			+ "1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test15903() throws IOException {
		S1_15903 problem = new S1_15903();
		
		String[] inputs = {
			"3 1\r\n"
			+ "3 2 6",
			"4 2\r\n"
			+ "4 2 3 1"
		};
		
		String[] outputs = {
			"16",
			"19"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test11286() throws IOException {
		S1_11286 problem = new S1_11286();
		
		String[] inputs = {
			"18\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "1\r\n"
			+ "-1\r\n"
			+ "-1\r\n"
			+ "2\r\n"
			+ "-2\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0"
		};
		
		String[] outputs = {
			"-1\r\n"
			+ "1\r\n"
			+ "0\r\n"
			+ "-1\r\n"
			+ "-1\r\n"
			+ "1\r\n"
			+ "1\r\n"
			+ "-2\r\n"
			+ "2\r\n"
			+ "0"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test29160() throws IOException {
		S2_29160 problem = new S2_29160();
		
		String[] inputs = {
			"11 1\r\n"
			+ "1 5\r\n"
			+ "2 4\r\n"
			+ "3 2\r\n"
			+ "4 3\r\n"
			+ "5 10\r\n"
			+ "6 9\r\n"
			+ "7 6\r\n"
			+ "8 8\r\n"
			+ "9 11\r\n"
			+ "10 5\r\n"
			+ "11 6"
		};
		
		String[] outputs = {
			"58"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test23757() throws IOException {
		S2_23757 problem = new S2_23757();
		
		String[] inputs = {
			"4 4\r\n"
			+ "4 3 2 1\r\n"
			+ "3 1 2 1",
			"4 3\r\n"
			+ "4 3 2 1\r\n"
			+ "3 1 5"
		};
		
		String[] outputs = {
			"1",
			"0"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test2075() throws IOException {
		S2_2075 problem = new S2_2075();
		
		String[] inputs = {
			"5\r\n"
			+ "12 7 9 15 5\r\n"
			+ "13 8 11 19 6\r\n"
			+ "21 10 26 31 16\r\n"
			+ "48 14 28 35 25\r\n"
			+ "52 20 32 41 49"
		};
		
		String[] outputs = {
			"35"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
	}
}


	private static void test11279() throws IOException {
		S2_11279 problem = new S2_11279();
		
		String[] inputs = {
			"13\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "3\r\n"
			+ "2\r\n"
			+ "1\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0"
		};
		
		String[] outputs = {
			"0\r\n"
			+ "2\r\n"
			+ "1\r\n"
			+ "3\r\n"
			+ "2\r\n"
			+ "1\r\n"
			+ "0\r\n"
			+ "0"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}


	private static void test1927() throws IOException {
		S2_1927 problem = new S2_1927();
		
		String[] inputs = {
			"9\r\n"
			+ "0\r\n"
			+ "12345678\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "32"
		};
		
		String[] outputs = {
			"0\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "12345678\r\n"
			+ "0"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}

	private static void test14235() throws IOException {
		S3_14235 problem = new S3_14235();
		
		String[] inputs = {
			"5\r\n"
			+ "0\r\n"
			+ "2 3 2\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0"
		};
		
		String[] outputs = {
			"-1\r\n"
			+ "3\r\n"
			+ "2\r\n"
			+ "-1"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	private static void test1417() throws IOException {
		// S5_1417 problem = new S5_1417();
		//S5_1417_2 problem = new S5_1417_2();
		S5_1417_3 problem = new S5_1417_3();
		
		String[] inputs = {
			"3\r\n"
			+ "5\r\n"
			+ "7\r\n"
			+ "7", // case 1
			"4\r\n"
			+ "10\r\n"
			+ "10\r\n"
			+ "10\r\n"
			+ "10", // case 2
			"1\r\n"
			+ "1", // case 3
			"5\r\n"
			+ "5\r\n"
			+ "10\r\n"
			+ "7\r\n"
			+ "3\r\n"
			+ "8" // case 4
		};
		
		String[] outputs = {
			"2", // case 1
			"1", // case 2
			"0", // case 3
			"4" // case 4
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\nexcept is " + outputs[i] + "\noutput is : ");
			problem.main(args);
		}
	}
	
	
	
}
