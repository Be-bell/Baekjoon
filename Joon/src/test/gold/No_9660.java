package test.gold;

import java.io.*;

public class No_9660 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		if(N%7==0 || (N-2)%7==0) bw.write("CY\n"); 
		else bw.write("SK\n");
		
		bw.flush();
		bw.close();
	}

}
