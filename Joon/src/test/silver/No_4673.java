package test.silver;

import java.io.*;

public class No_4673 {

	public static void main(String[] args) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] self_num = new boolean[10000];
		
		for(int i=1; i<=10000; i++) {
			int cons = i;
			String[] cons_digit = Integer.toString(cons).split("");
			int digit_sum = 0;
			for(int j=0; j<cons_digit.length; j++) {
				digit_sum += Integer.parseInt(cons_digit[j]);
			}
			if(cons+digit_sum<=10000) self_num[cons+digit_sum-1] = true;
		}
		
		for(int i=0; i<10000; i++) {
			if(!self_num[i]) bw.write(i+1 + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
