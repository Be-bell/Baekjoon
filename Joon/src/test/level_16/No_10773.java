package test.level_16;

import java.io.*;
import java.util.*;

public class No_10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<K; i++) {
			int X = Integer.parseInt(br.readLine());
			if(X==0) stack.pop();
			else stack.push(X);
		}
		
		int sum = 0;
		while(!stack.empty()) sum += stack.pop();
		bw.write(sum + "\n");
		bw.flush();
		bw.close();

	}

}
