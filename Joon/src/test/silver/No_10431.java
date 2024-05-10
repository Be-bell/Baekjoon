package test.silver;

import java.io.*;
import java.util.*;

public class No_10431 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int P = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<P; i++) {
			
			int count = 0;
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[20];
			int T = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int k = 1;
			while(k<20) {
				int w = k;
				while(w>0 && arr[w]<arr[w-1]) {
					swap(arr, w, w-1);
					count++;
					w--;
				}
				k++;
			}
			
			bw.write(T + " " + count + "\n");
		}
		
		bw.flush();
		bw.close();

	}
	
	static void swap(int[] arr, int num1, int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}

}
