package test.level_15;

import java.io.*;

public class No_2485 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] len = new int[N-1];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(i!=0) len[i-1] = arr[i] - arr[i-1];
		}
		
		int GCD = len[0];
		for(int j=1; j<len.length; j++) {
			GCD = gcd(GCD, len[j]);
		}
		
		int count = 0;
		
		for(int j=0; j<len.length; j++) {
			count += len[j]/GCD - 1;
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
	
	public static int gcd(int R1, int R2) {
		if(R1<R2) {
			int term = R1;
			R1 = R2;
			R2 = term;
		}
		if(R2!=0) return gcd(R2, R1%R2); 
		else return R1;
	}
}
