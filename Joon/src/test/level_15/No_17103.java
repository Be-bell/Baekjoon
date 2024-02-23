package test.level_15;

import java.io.*;

public class No_17103 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		boolean[] prime = eratos(1000000);
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int goldbach = 0;
			
			for(int j=2; j<=N/2; j++) {
			 // 시간복잡도에 대한 차이로 인해 틀린풀이 (3중for문 발생하여 O(n^(3/2)))의 복잡도 발생)
			 // if(isPrime(j) && isPrime(N-j)) goldbach++;
				
				if(!prime[j] && !prime[N-j]) goldbach++;
			}
			bw.write(goldbach + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}
	
	public static boolean[] eratos(int N) {
		boolean[] prime = new boolean[N+1];
		prime[0] = prime[1] = true;
		
		for(int i=2; i<Math.sqrt(N); i++) {
			if(prime[i]) continue;
			for(int j=2*i; j<N+1; j+=i) prime[j] = true;
		}
		return prime;
	}
	
	/*
	public static boolean isPrime(int A) {
		if(A<2) return false;
		
		for(int i=2; i<=Math.sqrt(A); i++) {
			if(A%i==0) return false;
		}
		
		return true;
	}
	*/
	
	

}
