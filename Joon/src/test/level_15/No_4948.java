package test.level_15;

import java.io.*;

public class No_4948 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			int count = 0;
			for(int i=n+1; i<=2*n; i++) {
				if(isPrime(i)) count++;
			}
			bw.write(count + "\n");
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
