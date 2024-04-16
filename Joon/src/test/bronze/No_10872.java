package test.bronze;

import java.io.*;

public class No_10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int factorial = 1;
		for(int i=1; i<=N; i++) factorial *= i;
		bw.write(factorial + "\n");
		bw.flush();
		bw.close();

	}

}
