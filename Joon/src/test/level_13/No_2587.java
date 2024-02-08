package test.level_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No_2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[5];
		int mean = 0;
		int mid = 0;
		
		for(int i=0; i<5; i++) {
			arr[i]=Integer.parseInt(bf.readLine());
			mean += arr[i];
		}
		
		Arrays.sort(arr);
		mean = mean/5;
		mid = arr[2];
		
		bw.write(mean + "\n" + mid + "\n");
		bw.flush();
		bw.close();

	}

}
