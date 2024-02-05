package test.level_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_24313 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] fn = bf.readLine().split(" ");
		
		int a1 = Integer.parseInt(fn[0]);
		int a0 = Integer.parseInt(fn[1]);
		int c = Integer.parseInt(bf.readLine());
		int n0 = Integer.parseInt(bf.readLine());
		
		if(((a1-c)*n0+a0)<=0 && a1<=c) bw.write("1\n");
		else bw.write("0\n");
		
		bw.flush();
		bw.close();

	}

}
