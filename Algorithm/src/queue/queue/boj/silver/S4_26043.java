package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S4_26043 {
	
	static class Student {
		int studentNum, menuNum;
		
		Student(int sn, int mn) {
			this.studentNum = sn;
			this.menuNum = mn;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Student> q = new LinkedList<Student>();
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		
		while (n-- > 0) { // 명령줄 n번 반복
			String[] str = br.readLine().split(" ");
			
			int command = Integer.parseInt(str[0]);
			
			if (command == 1) { // 학생이 입구 대기
				q.add(new Student(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
			} else { // command가 2인 경우, 즉 음식이 준비 됨
				int menuNum = Integer.parseInt(str[1]);
				
				Student student = q.poll();
				if (menuNum == student.menuNum)
					a.add(student.studentNum);
				else
					b.add(student.studentNum);
			}
		}
		
		while (!q.isEmpty())
			c.add(q.poll().studentNum);
		
		// 문제에서 원하는 오름차순 정렬
		Collections.sort(a);
		Collections.sort(b);
		Collections.sort(c);
		
		// 출력
		print(bw, a);
		print(bw, b);
		print(bw, c);
		
		bw.flush();
		// br.close();
		// bw.close();
	}

	private static void print(BufferedWriter bw, List<Integer> list) throws IOException {
		if (list.isEmpty())
			bw.write("None\n");
		else {
			for (int i = 0; i < list.size(); i++) {
				bw.write("" + list.get(i));
				
				if (i != list.size() - 1)
					bw.write(" ");
				else
					bw.write("\n");
			}
		}
	}
	
}