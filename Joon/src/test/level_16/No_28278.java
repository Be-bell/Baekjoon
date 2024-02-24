package test.level_16;

import java.io.*;
import java.util.*;

public class No_28278 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			switch(A) {
				case 1:
					int X = Integer.parseInt(st.nextToken());
					stack.push(X);
					break;
				
				case 2:
					if(stack.empty()) bw.write("-1\n");
					else bw.write(stack.pop() + "\n");
					break;
				
				case 3:
					bw.write(stack.size() + "\n");
					break;
					
				case 4:
					if(stack.empty()) bw.write("1\n");
					else bw.write("0\n");
					break;
				
				case 5:
					if(stack.empty()) bw.write("-1\n");
					else bw.write(stack.peek() + "\n");
					break;
					
			}
			
		}
		
		bw.flush();
		bw.close();

	}

}
