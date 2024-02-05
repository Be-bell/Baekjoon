package test.level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_5073 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] s = bf.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]); 
			int c = Integer.parseInt(s[2]);
			
			int max=Math.max(a, Math.max(b, c));
			int min=Math.min(a, Math.min(b, c));
			int mid=0;
			
			if(max==a) mid=Math.max(b,c);
			else if(max==b) mid=Math.max(a, c);
			else mid=Math.max(a,b);
			
			if(max+mid+min==0) break;
			else if(max>=(mid+min)) bw.write("Invalid\n");
			else {
				if(max==mid && mid==min) bw.write("Equilateral\n");
				else if(max!=mid && mid!=min) bw.write("Scalene\n");
				else bw.write("Isosceles\n");
			}
		}
		
		bw.flush();
		bw.close();

	}

}