package test.gold;

import java.util.*;
import java.io.*;

public class No_1918 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String[] str = br.readLine().split("");
		int length = str.length;
		
		Stack<String> operator = new Stack<>();	// 연산자를 담는 스택
		
		// postfix는 후위표기식을 담을 문자열, pre는 operator를 peek하기 위해 생성한 변수.
		String postfix = "";
		String pre = "";
		
		while(length>0) {
			String s = str[str.length - length];
			
			// 열린 괄호면 무조건 push
			if(s.equals("(")) {
				operator.push(s);
			}
			
			// 닫힌 괄호면 열린 괄호가 나올때까지 pop하여 postfix에 집어넣음.
			else if(s.equals(")")) {
				pre = operator.peek();
				while(!pre.equals("(")) {
					postfix += operator.pop();
					pre = operator.peek();
				}
				operator.pop();
			}
			
			// +나 -일 경우, 먼저 연산자 스택이 비어있는지 안비어있는지 확인
			else if(s.equals("+") || s.equals("-")) {
				if(operator.isEmpty()) {
					operator.push(s);
				} else {
			// 연산자 스택이 안비어 있으면 peek하여 연산자 확인 후 pop해줌.
					pre = operator.peek();
					while(pre.equals("*") || pre.equals("/") || pre.equals("+") || pre.equals("-")) {
						postfix += operator.pop();
			// 연산자 pop 후 비어있으면 while문 break, 아니면 계속 검사.
						if(operator.isEmpty()) break;
						else pre = operator.peek();
					}
			// while문이 종료되면 연산자 push
					operator.push(s);
				}
			}
			
			// 곱하기, 나누기도 더하기, 빼기와 마찬가지의 수순으로 진행, while문의 조건만 달라짐.(우선순위가 더 높음)
			else if(s.equals("*") || s.equals("/")) {
				if(operator.isEmpty()) {
					operator.push(s);
				} else {
					pre = operator.peek();
					while(pre.equals("*") || pre.equals("/")) {
						postfix += operator.pop();
						if(operator.isEmpty()) break;
						else pre = operator.peek();
					}
					operator.push(s);
				}
			}
			
			// 연산자가 아니면(피연산자 이면) 그냥 문자열에 대입.
			else postfix += s;
			
			//검사 완료 후 length--하여 다음 문자 확인.
			length--;
		}
		
		// stack에 연산자가 남아있으면 모두 pop함.
		while(!operator.isEmpty()) postfix += operator.pop();
		
		bw.write(postfix + "\n");
		bw.flush();
        bw.close();

	}

}