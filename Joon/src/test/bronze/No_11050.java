package test.bronze;

import java.io.*;
import java.util.*;

public class No_11050 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int nume = 1;
		int deno = 1;
		
		for(int i=1; i<=K; i++) {
			nume *= N;
			deno *= i;
			N--;
		}
		
		int binomial = nume / deno;
		
		bw.write(binomial + "\n");
		bw.flush();
		bw.close();

	}

}
