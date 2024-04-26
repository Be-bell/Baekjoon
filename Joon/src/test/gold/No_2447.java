package test.gold;

import java.io.*;

public class No_2447 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[][] arr = new boolean[N][N];
		
		arr = isNotSpot(arr,1, N);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j]) bw.write(" ");
				else bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	
	static boolean[][] isNotSpot(boolean[][] arr, int first, int last) {
		// first가 last보다 크면, 재귀함수 끝.
		if(first>last) return arr;
		
		// 각 배열의 좌표값을 first로 나눈 값의 3으로 다시 나눈 나머지가 1이면 ㅈ
		for(int i=0; i<last; i++) {
			for(int j=0; j<last; j++) {
				if(i/first%3==1 && j/first%3==1) arr[i][j] = true;
			}
		}
		int next = first*3;
		arr = isNotSpot(arr,next,last);
		return arr;
	}

}
