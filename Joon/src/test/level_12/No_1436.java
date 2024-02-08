package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_1436 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		int num = 666;
		int count = 1;
		
		while(count!=N) {
			num++;
			if(Integer.toString(num).contains("666")) count++;
		}
		
		bw.write(num + "\n");
		bw.flush();
		bw.close();

	}

}
