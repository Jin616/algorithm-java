package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S3_1966 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		
		while (t-- > 0) {
			Queue<Document> q = new LinkedList<Document>();
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int watchIndex = Integer.parseInt(str[1]);
			
			// 문서 입력 받기
			str = br.readLine().split(" ");
			for (int i = 0; i < n; i++)
				q.add(new Document(i, Integer.parseInt(str[i])));
			
			int printCount = 0;
			
			// watchIndex까지 문서 빼보기
			while (!q.isEmpty()) {
				Document doc = q.poll(); // 가장 앞에 있는 문서 뺌
				
				boolean priorityCheck = false; // 문서 뭉치 중에 우선순위 높은 게 있는지 비교
				for (int i = 0; i < q.size(); i++) { // 문서 순회
					Document tem = q.poll(); // 일단 빼고
					
					if (!priorityCheck && tem.priority > doc.priority)
						priorityCheck = true; // 중요도 높은게 있으면 true로
					
					q.add(tem); // 다시 담기
				}
				
				if (priorityCheck) // 중요한게 있으면
					q.add(doc); // 다시 q에 담기 (맨 뒤로)
				else if (watchIndex == doc.num) { // 중요한게 없고, 인덱스가 같으면
					bw.write("" + ++printCount + "\n"); //  몇번째 프린트 되건지 출력
					break ; // 케이스 종료
				} else {
					printCount++; // 정상적으로 출력된 것이니 다시 안 넣고 카운팅
				}
			}
			
		}
		
		bw.flush();
		// br.close();
		// bw.close();
	}
	
	static class Document {
		int num, priority;
		
		Document(int num, int priority) {
			this.num = num;
			this.priority = priority;
		}
	}
	
}