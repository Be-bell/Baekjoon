package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_19532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] arr = new int[6];
		for(int i=0; i<6; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int x = (arr[2]*arr[4]-arr[5]*arr[1])/(arr[0]*arr[4]-arr[3]*arr[1]);
		int y;
		
		if(arr[1]!=0) {
			y = (arr[2]-arr[0]*x)/arr[1];
		} else {
			y = (arr[5]-arr[3]*x)/arr[4];
		}
		
		
		bw.write(x + " " + y + "\n");
		bw.flush();
		bw.close();

	}

}
