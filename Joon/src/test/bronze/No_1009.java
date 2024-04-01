package test.bronze;

import java.io.*;
import java.util.*;

public class No_1009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int module = a%10;
			
			for(int j=1; j<b; j++) {
				module *= a;
				module %= 10;
			}
			
			module = (module==0 ? 10:module);
			
			bw.write(module + "\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
