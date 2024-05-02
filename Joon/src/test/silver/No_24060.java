package test.silver;

import java.io.*;
import java.util.*;

public class No_24060 {
	
	static int N;
	static int value;
	static int[] tmp;
	static int[] arr;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[A+1];
		tmp = new int[A+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<A+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(1, A);
		
		if(N>0) {
			bw.write(-1 + "\n");
		} else {
			bw.write(value + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void merge_sort(int left, int right) {
		if(left<right) {
			int mid = (left+right) / 2;
			merge_sort(left, mid);
			merge_sort(mid+1, right);
			merge(left, mid, right);
		}
	}
	
	public static void merge(int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int t = 1;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) tmp[t++] = arr[i++];
			else tmp[t++] = arr[j++];
		}
		while(i<=mid) tmp[t++] = arr[i++];
		while(j<=right) tmp[t++] = arr[j++];
		
		i=left;
		t=1;
		
		while(i<=right && N>0) {
			value = tmp[t];
			arr[i++] = tmp[t++];
			N--;
		}
	}
}
