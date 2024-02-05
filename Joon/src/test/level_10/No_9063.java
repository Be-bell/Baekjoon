package test.level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_9063 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		String[] s1 = bf.readLine().split(" ");
		int x1 = Integer.parseInt(s1[0]);
		int y1 = Integer.parseInt(s1[1]);
		int x_max = x1;
		int x_min = x1;
		int y_max = y1;
		int y_min = y1;
		
		for(int i=1; i<N; i++) {
			String[] s2 = bf.readLine().split(" ");
			int x = Integer.parseInt(s2[0]);
			int y = Integer.parseInt(s2[1]);
			x_max = Math.max(x, x_max);
			x_min = Math.min(x, x_min);
			y_max = Math.max(y, y_max);
			y_min = Math.min(y, y_min);
		}
		
		bw.write( (x_max-x_min)*(y_max-y_min) + "\n");
		bw.flush();
		bw.close();

	}

}