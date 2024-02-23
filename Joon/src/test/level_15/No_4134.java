package test.level_15;

import java.io.*;

public class No_4134 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			long A = Long.parseLong(br.readLine());
			while(true) {
				if(isPrime(A)) {
					bw.write(A + "\n");
					break;
				}
				A++;
			}
		}
		
		bw.flush();
		bw.close();
	}
	
	
	public static boolean isPrime(long A) {
		if(A<2) return false;
		
		for(int i=2; i<=Math.sqrt(A); i++) {
			if(A%i==0) return false;
		}
		
		return true;
	}

}
