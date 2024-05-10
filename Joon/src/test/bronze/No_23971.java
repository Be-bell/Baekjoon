package test.bronze;

import java.io.*;
import java.util.*;

public class No_23971 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int row = H/(N+1) == 0 ? 1 : (int) Math.ceil((double)H / (N+1));
		int column = W/(M+1) == 0 ? 1 : (int) Math.ceil((double)W / (M+1));
		
		bw.write((row * column) + "\n");
		bw.flush();
		bw.close();

	}

}
