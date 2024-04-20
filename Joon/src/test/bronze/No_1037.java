package test.bronze;

import java.io.*;
import java.util.*;

public class No_1037 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int Min = A;
		int Max = A;
		for(int i=1; i<T; i++) {
			int B = Integer.parseInt(st.nextToken());
			Min = Math.min(Min, B);
			Max = Math.max(Max, B);
		}
		
		int N = Min * Max;
		
		bw.write(N + "\n");
		bw.flush();
		bw.close();
	}

}
