package test.level_16;

import java.io.*;
import java.util.*;

public class No_12789 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>(); 					//대기줄
		Stack<Integer> stack = new Stack<>(); 						//샛길
		int count = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			queue.offer(n);	 										//대기줄에 온 순서대로 넣기
		}
		
		while(!queue.isEmpty()) { 									//대기줄을 먼저 비운다
			if(queue.peek()==count) {								//대기줄 순번 = 번호표 -> 통과 후 count++
				queue.poll();
				count++;
			} else {												//대기줄 순번 != 번호표
				if(!stack.empty() && stack.peek()==count) {			//1. 샛길에서 번호표 순서 있는지 확인
					stack.pop();
					count++;
				} else stack.push(queue.poll());					//2. 샛길에도 없으면 대기줄->샛길로 이동
			}
		}
		
		while(!stack.empty()) {										//대기줄이 다 비워졌으면 샛길 확인
			if(stack.peek()==count) {								//샛길 순번이 번호표와 같을경우 통과 후 count++
				stack.pop();
				count++;
			} else break;											//아닐 경우 stack2에 남은 인원 생김.
		}
		
		if(stack.empty()) bw.write("Nice\n");
		else bw.write("Sad\n");	
		
		bw.flush();
		bw.close();

	}

}
