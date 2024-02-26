package test.level_16;

import java.io.*;
import java.util.*;

public class No_9012 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				
				if(c=='(') stack.push(c);
				
				else if(c==')' && stack.empty()) {
					stack.push(c);
					break;
				}
				
				else stack.pop();
			}
			
			if(stack.empty()) bw.write("YES\n");
			else bw.write("NO\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
