package test.level_15;

import java.io.*;

public class No_13909 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=1; i<=Math.sqrt(N); i++) count++;

		bw.write(count + "\n");
		bw.flush();
		bw.close();
		
	}

}
