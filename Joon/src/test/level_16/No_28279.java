package test.level_16;

import java.io.*;
import java.util.*;

public class No_28279 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> stack = new ArrayDeque<>();
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			int X;
			switch(command) {
			case 1:
				X = Integer.parseInt(st.nextToken());
				stack.offerFirst(X);
				break;
			case 2:
				X = Integer.parseInt(st.nextToken());
				stack.offer(X);
				break;
			case 3:
				if(stack.isEmpty()) bw.write("-1\n");
				else bw.write(stack.poll() + "\n");
				break;
			case 4:
				if(stack.isEmpty()) bw.write("-1\n");
				else bw.write(stack.pollLast() + "\n");
				break;
			case 5:
				bw.write(stack.size() + "\n");
				break;
			case 6:
				if(stack.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
				break;
			case 7:
				if(stack.isEmpty()) bw.write("-1\n");
				else bw.write(stack.peek()+"\n");
				break;
			case 8:
				if(stack.isEmpty()) bw.write("-1\n");
				else bw.write(stack.peekLast()+"\n");
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
