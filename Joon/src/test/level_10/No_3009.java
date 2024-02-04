package test.level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_3009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[2][3];
		
		for(int i=0; i<3; i++) {
			String[] s2 = bf.readLine().split(" ");
			arr[0][i] = Integer.parseInt(s2[0]);
			arr[1][i] = Integer.parseInt(s2[1]);
		}
		
		for(int j=0; j<2; j++) {
			if(arr[j][0]==arr[j][1]) bw.write(arr[j][2] + " ");
			else {
				if(arr[j][0]==arr[j][2]) bw.write(arr[j][1] + " ");
				else bw.write(arr[j][0] + " ");
			}
		}
		
		bw.flush();
		bw.close();

	}

}