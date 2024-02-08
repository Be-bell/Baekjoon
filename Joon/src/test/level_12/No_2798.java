package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s1 = bf.readLine().split(" ");
		int N = Integer.parseInt(s1[0]);
		int M = Integer.parseInt(s1[1]);
		
		String[] s2 = bf.readLine().split(" ");
		int sum = 0;
		
		for(int i=0; i<N-2; i++) {
			int num1 = Integer.parseInt(s2[i]);
			for(int j=i+1; j<N-1; j++) {
				int num2 = Integer.parseInt(s2[j]);
				for(int k=j+1; k<N; k++) {
					int num3 = Integer.parseInt(s2[k]);
					if(M-(num1+num2+num3)>=0 && M-sum>=M-(num1+num2+num3)) {
						sum = num1+num2+num3;
					}
				}
			}
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}

}
