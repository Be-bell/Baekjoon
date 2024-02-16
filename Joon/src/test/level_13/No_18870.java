package test.level_13;

import java.io.*;
import java.util.*;

public class No_18870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][2] = i;
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) return e1[2] - e2[2];
			else return e1[0]-e2[0];
		});
		
		int count = 1;
		for(int i=1; i<N; i++) arr[i][1] = (arr[i][0]==arr[i-1][0] ? arr[i-1][1] : count++); 
		
		Arrays.sort(arr, (e1, e2) -> {
			return e1[2] - e2[2];
		});
		
		for(int i=0; i<N; i++) bw.write(arr[i][1] + " ");
		
		bw.flush();
		bw.close();
		
	}

}
