package test.level_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No_1427 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] N = bf.readLine().split("");
		Arrays.sort(N);
		for(int i=N.length-1; i>=0; i--) bw.write(N[i]+"");
		bw.write("\n");
		bw.flush();
		bw.close();

	}

}
