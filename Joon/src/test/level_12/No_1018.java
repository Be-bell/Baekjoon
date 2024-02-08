package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_1018 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[][] board = new String[N][M];
		
		for(int i=0; i<N; i++) {
			String[] s = bf.readLine().split("");
			for(int j=0; j<M; j++) board[i][j] = s[j];
		}
		
		String[][] chess1 = new String[8][8];
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i+j)%2==0) chess1[i][j] = "B";
				else chess1[i][j] = "W";
			}
		}
		
		String[][] chess2 = new String[8][8];
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i+j)%2!=0) chess2[i][j] = "B";
				else chess2[i][j] = "W";
			}
		}
		
		int total_count = -1;
		
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				int count1 = 0;
				int count2 = 0;
				for(int idx=i; idx<i+8; idx++) {
					for(int jdx=j; jdx<j+8; jdx++) {
						if(!(chess1[idx-i][jdx-j].equals(board[idx][jdx]))) count1++;
						if(!(chess2[idx-i][jdx-j].equals(board[idx][jdx]))) count2++;
					}
				}
				int count = Math.min(count1, count2);
				if(total_count==-1) total_count = count;
				else total_count = Math.min(total_count, count);
			}
		}
		
		bw.write(total_count + "\n");
		bw.flush();
		bw.close();

	}

}
