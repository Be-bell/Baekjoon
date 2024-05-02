package test.gold;

import java.io.*;

public class No_11729 {
	
	static StringBuilder sb = new StringBuilder();
	static int count;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		hanoi(1, 2, 3, N);
		
		bw.write(count + "\n");
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();

	}
	
	static void hanoi(int first, int mid, int last, int N) {
		if(N==1) {
			sb.append(first + " " + last + "\n");
			count++;
			return;
		}
		hanoi(first, last, mid, N-1);
		hanoi(first, mid, last, 1);
		hanoi(mid, first, last, N-1);
	}
}
