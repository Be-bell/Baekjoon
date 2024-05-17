package test.gold;

import java.io.*;

public class No_15989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			
			while(N>=0) {
				count += (N/2) + 1;
				N -= 3;
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
