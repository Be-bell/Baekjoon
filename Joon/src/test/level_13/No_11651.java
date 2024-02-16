package test.level_13;

import java.io.*;
import java.util.*;

public class No_11651 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[][] arr = new int[N][2];
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (arr1, arr2) -> {
			if(arr1[1] == arr2[1]) {
				return arr1[0] - arr2[0];
			} else {
				return arr1[1] - arr2[1];
			}
		});
		
		for(int i=0; i<N; i++) bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		bw.flush();
		bw.close();

	}

}
