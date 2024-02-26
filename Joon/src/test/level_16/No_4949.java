package test.level_16;

import java.io.*;
import java.util.*;

public class No_4949 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		while(true) {
			s = br.readLine();
			if(s.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();

			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				
				if(c=='(' || c=='[') {
					stack.push(c);
				} else if(c==')') {
					if(!stack.empty() && stack.peek()=='(') stack.pop();
					else {
						stack.push(')');
						break;
					}
				} else if(c==']') {
					if(!stack.empty() && stack.peek()=='[') stack.pop();
					else {
						stack.push(']');
						break;
					}
				}
			}

			if(s.charAt(s.length()-1)=='.') {
				if(stack.empty()) bw.write("yes\n");
				else bw.write("no\n");
			} else bw.write("no\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
