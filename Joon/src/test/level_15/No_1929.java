package test.level_15;

import java.io.*;
import java.util.*;

public class No_1929 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();

	}
	
	public static boolean isPrime(int A) {
		if(A<2) return false;
		
		for(int i=2; i<=Math.sqrt(A); i++) {
			if(A%i==0) return false;
		}
		
		return true;
	}

}
