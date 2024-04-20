package test.silver;

import java.io.*;
import java.util.*;

public class No_1920 {
	
	static int BinarySearch(int[] arr, int first, int last, int num) {
		int mid = (first+last)/2;
		while(first<=last) {
			if(num<arr[mid]) {
            last = mid-1;
            } else if(num>arr[mid]) {
            first = mid+1;
			} else {
            return 1;
			}
			mid = (first+last)/2;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) arr1[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr1);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<M; j++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(BinarySearch(arr1, 0, arr1.length-1, num) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
