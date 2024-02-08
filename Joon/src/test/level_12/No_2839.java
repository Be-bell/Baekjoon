package test.level_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2839 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		int count = -1;
		
		for(int x=0; x<=2000; x++) {
			for(int y=0; y<=1000; y++) {
				if(3*x+5*y==N) {
					if(count==-1) count = x+y;
					else count = Math.min(count,x+y);
					break;
				}
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();

	}

}
