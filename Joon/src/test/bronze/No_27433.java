package test.bronze;

import java.io.*;

public class No_27433 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N+1];
		arr[0] = 1;
		for(int i=1; i<=N; i++) {
			arr[i] = arr[i-1] * i;
		}
		
		bw.write(arr[N] + "\n");
		bw.flush();
		bw.close();

	}

}
