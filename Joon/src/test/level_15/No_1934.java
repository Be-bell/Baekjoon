package test.level_15;

import java.io.*;
import java.util.*;

public class No_1934 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			int term;
			if(A<B) {
				term = A;
				A = B;
				B = term;
			}
			
			while(A%B!=0) {
				term = B;
				B = A%B;
				A = term;
			}
			
			bw.write(Integer.parseInt(s[0])*Integer.parseInt(s[1])/B + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
