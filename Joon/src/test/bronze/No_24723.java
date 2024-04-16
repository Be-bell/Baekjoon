package test.bronze;

import java.io.*;

public class No_24723 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		bw.write((int) Math.pow(2, N) + "\n");
		bw.flush();
		bw.close();

	}

}
