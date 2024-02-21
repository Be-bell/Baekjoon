package test.level_15;

import java.io.*;
import java.util.*;

public class No_13241 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long term;
		
		if(A<B) {
			term = A;
			A = B;
			B = term;
		}
		
		long A2 = A;
		long B2 = B;
		
		while(A2%B2!=0) {
			term = B2;
			B2 = A2%B2;
			A2 = term;
		}
		
		bw.write(A*B/B2 + "\n");
		bw.flush();
		bw.close();

	}

}
