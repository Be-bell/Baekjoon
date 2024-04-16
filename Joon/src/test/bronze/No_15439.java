package test.bronze;

import java.io.*;

public class No_15439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(N*(N-1) + "\n");
		bw.flush();
		bw.close();

	}

}
