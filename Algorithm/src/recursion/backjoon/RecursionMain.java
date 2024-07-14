package recursion.backjoon;

import java.io.IOException;

import recursion.backjoon.silver.S3_24460;
import recursion.backjoon.silver.S3_4779;
import recursion.backjoon.silver.S4_10994;
import recursion.backjoon.silver.S4_24418;
import recursion.backjoon.silver.S5_17478;
import recursion.backjoon.silver.S5_18511;

public class RecursionMain {

	public static void main(String[] args) throws IOException {
		// silver
		// test10994();
		// test17478();
		// test18511();
		// test24418();
		// test4779();
		test24460();
	}

	private static void test24460() throws IOException {
		S3_24460 problem = new S3_24460();
		
		String[] inputs = {
			"2\r\n"
			+ "2 0\r\n"
			+ "3 1",
			"4\r\n"
			+ "15 7 13 5\r\n"
			+ "4 2 1 9\r\n"
			+ "0 10 8 12\r\n"
			+ "3 11 14 6"
		};
		
		String[] outputs = {
			"1",
			"4"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
	}

	private static void test4779() throws IOException {
		S3_4779 problem = new S3_4779();
		
		String[] inputs = {
			"0\r\n"
			+ "1\r\n"
			+ "3\r\n"
			+ "2"
		};
		
		String[] outputs = {
			"-\r\n"
			+ "- -\r\n"
			+ "- -   - -         - -   - -\r\n"
			+ "- -   - -"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
	}

	private static void test24418() throws IOException {
		S4_24418 problem = new S4_24418();
		
		String[] inputs = {
			"5\r\n"
			+ "1 1 1 1 1\r\n"
			+ "2 2 2 2 2\r\n"
			+ "3 3 3 3 3\r\n"
			+ "4 4 4 4 4\r\n"
			+ "5 5 5 5 5"
		};
		
		String[] outputs = {
			"252 25"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
	}

	private static void test18511() throws IOException {
		S5_18511 problem = new S5_18511();
		
		String[] inputs = {
			"657 3\r\n"
			+ "1 5 7",
			"100000000 1\r\n"
			+ "1"
		};
		
		String[] outputs = {
			"577",
			"11111111"
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
	}
	
	private static void test17478() throws IOException {
		S5_17478 problem = new S5_17478();
		
		String[] inputs = {
			"2",
			"4"
		};
		
		String[] outputs = {
			"어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\r\n"
			+ "\"재귀함수가 뭔가요?\"\r\n"
			+ "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "____\"재귀함수가 뭔가요?\"\r\n"
			+ "____\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "____마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "____그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "________\"재귀함수가 뭔가요?\"\r\n"
			+ "________\"재귀함수는 자기 자신을 호출하는 함수라네\"\r\n"
			+ "________라고 답변하였지.\r\n"
			+ "____라고 답변하였지.\r\n"
			+ "라고 답변하였지.",
			"어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\r\n"
			+ "\"재귀함수가 뭔가요?\"\r\n"
			+ "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "____\"재귀함수가 뭔가요?\"\r\n"
			+ "____\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "____마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "____그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "________\"재귀함수가 뭔가요?\"\r\n"
			+ "________\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "________마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "________그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "____________\"재귀함수가 뭔가요?\"\r\n"
			+ "____________\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\r\n"
			+ "____________마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\r\n"
			+ "____________그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\r\n"
			+ "________________\"재귀함수가 뭔가요?\"\r\n"
			+ "________________\"재귀함수는 자기 자신을 호출하는 함수라네\"\r\n"
			+ "________________라고 답변하였지.\r\n"
			+ "____________라고 답변하였지.\r\n"
			+ "________라고 답변하였지.\r\n"
			+ "____라고 답변하였지.\r\n"
			+ "라고 답변하였지."
		};
		
		System.out.print("Test case size " + inputs.length);
		for (int i = 0; i < inputs.length; i++) {
			String[] args = {inputs[i]};
			
			System.out.print("\ne : " + outputs[i] + "\no : ");
			problem.main(args);
		}
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
