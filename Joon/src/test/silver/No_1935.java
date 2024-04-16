package test.silver;

import java.io.*;
import java.util.*;

public class No_1935 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("");
		
		int[] alpha = new int[N];
		for(int i=0; i<N; i++) {
			alpha[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Double> operant = new Stack<>();
		
		for(int j=0; j<s.length; j++) {
			String str = s[j];
			if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
				double num1 = operant.pop();
				double num2 = operant.pop();
				double num_result = 0.0f;
				switch(str) {
				case "+" :
					num_result = num2 + num1;
					break;
				case "-" :
					num_result = num2 - num1;
					break;
				case "*" :
					num_result = num2 * num1;
					break;
				case "/" :
					num_result = num2 / num1;
					break;
				}
				operant.push(num_result);
			} else {
				operant.push((double) alpha[str.charAt(0)-65]);
			}
		}
		
		String result = String.format("%.2f", operant.pop());
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		
	}

}
