package test.silver;

import java.io.*;
import java.util.*;

public class No_1010 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N>M/2) N = M-N;
			
			long nume = 1;
			long deno = 1;
			for(int j=1; j<=N; j++) {
				deno *= j;
				nume *= M;
				M--;
			}
			
			bw.write((long) nume/deno + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
