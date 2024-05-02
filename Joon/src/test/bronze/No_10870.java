package test.bronze;

import java.io.*;

public class No_10870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+1];
		arr[0]=0;
		if(N!=0) arr[1]=1;
		for(int i=2; i<=N; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		bw.write(arr[N] + "\n");
		bw.flush();
		bw.close();

	}

}
