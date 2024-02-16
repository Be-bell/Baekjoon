package test.level_13;

import java.io.*;
import java.util.*;

public class No_10814 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][3];
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = Integer.toString(i);
		}
		
		Arrays.sort(arr, (arr_1, arr_2) -> {
			if(Integer.parseInt(arr_1[0])==Integer.parseInt(arr_2[0])) {
				return Integer.parseInt(arr_1[2]) - Integer.parseInt(arr_2[2]);
			} else {
				return Integer.parseInt(arr_1[0]) - Integer.parseInt(arr_2[0]);
			}
		});
		
		for(int i=0; i<N; i++) bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		bw.flush();
		bw.close();
		
	}

}
