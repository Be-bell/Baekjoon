package test.level_14;

import java.io.*;
import java.util.*;

public class No_1269 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		HashSet<Integer> set_A = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			set_A.add(A[i]);
		}
		
		int[] B = new int[M];
		HashSet<Integer> set_B = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<M; j++) {
			B[j] = Integer.parseInt(st.nextToken());
			set_B.add(B[j]);
		}
		
		int A_minus_B = N;
		for(int i=0; i<N; i++) {
			if(set_B.contains(A[i])) A_minus_B--;
		}
		
		int B_minus_A = M;
		for(int j=0; j<M; j++) {
			if(set_A.contains(B[j])) B_minus_A--;
		}
		
		bw.write(A_minus_B + B_minus_A + "\n");
		bw.flush();
		bw.close();
		
	}

}
