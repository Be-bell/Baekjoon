package test.level_15;

import java.io.*;
import java.util.*;

public class No_1735 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int A2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		
		int nume = A1*B2 + A2*B1;
		int deno = B1*B2;
		
		int mod = GCD(nume, deno);
		nume /= mod;
		deno /= mod;
		
		bw.write(nume + " " + deno + "\n");
		bw.flush();
		bw.close();
		
	}
	
	public static int GCD(int R1, int R2) {
		if(R1<R2) {
			int term = R1;
			R1 = R2;
			R2 = term;
		}
		
		if(R2!=0) return GCD(R2, R1%R2); 
		else return R1;
	}

}
