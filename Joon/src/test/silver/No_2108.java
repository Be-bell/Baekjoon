package test.silver;

import java.io.*;
import java.util.*;

public class No_2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] num = new int[8001]; // 최빈값
		int sum = 0;	// 산술평균
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			int A = Integer.parseInt(br.readLine());
			num[A+4000]++;
			sum += A;
			arr[i] = A;
		}
		
		Arrays.sort(arr);
		
		int count = 0;
		boolean isModeMany = false;
		int mode = 0;
		for(int j=0; j<num.length; j++) {
			if(count<num[j]) {
				mode = j-4000;
				count = num[j];
				isModeMany = false;
			} else if(count != 0 &&count==num[j] && !isModeMany) {
				isModeMany = true;
				mode = j-4000;
			}
		}
		
		int mean = Math.round((float) sum / N);
		int mid = arr[N/2];
		int range = arr[N-1] - arr[0];
		
		bw.write(mean + "\n" + mid + "\n" + mode + "\n" + range);
		bw.flush();
		bw.close();
		
	}

}
