package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2231 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(bf.readLine());
		long cons = 0;
		
		for(long i=1; i<=N; i++) {
			long num = i;
			long digit = num%10;
			while(num/10>0) {
				num = num/10;
				digit = digit + num%10;
				}

			if((digit+i)==N) {
				cons = i;
				break;
			}
		}
		
		bw.write(cons + "\n");
		bw.flush();
		bw.close();

	}

}
