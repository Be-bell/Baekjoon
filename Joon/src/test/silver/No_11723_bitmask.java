package test.silver;

import java.io.*;
import java.util.*;

public class No_11723_bitmask {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int set = 0;
		StringTokenizer st;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int num;
			switch(st.nextToken()) {
			case "add" :
				num = Integer.parseInt(st.nextToken());
				set |= (1 << (num-1));
				break;
				
			case "check" :
				num = Integer.parseInt(st.nextToken());
				if((set & (1 << (num-1))) != 0) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
				
			case "remove" :
				num = Integer.parseInt(st.nextToken());
				set &= ~(1 << (num-1));
				break;
				
			case "toggle" :
				num = Integer.parseInt(st.nextToken());
				set ^= (1 << (num-1));
				break;
				
			case "all" :
				set |= (~0);
				break;
				
			case "empty":
				set = 0;
				break;
				
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
