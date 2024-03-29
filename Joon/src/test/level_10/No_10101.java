package test.level_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_10101 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] angle = new int[3];
		
		for(int i=0; i<3; i++) angle[i] = Integer.parseInt(bf.readLine());
		
		if(angle[0]+angle[1]+angle[2] == 180) {
			if(angle[0]==60 && angle[0]==angle[1] && angle[0]==angle[2]) bw.write("Equilateral\n");
			else if(angle[0]!=angle[1] && angle[0]!=angle[2] && angle[1]!=angle[2]) bw.write("Scalene\n");
			else bw.write("Isosceles");
		} else bw.write("Error\n");
		
		bw.flush();
		bw.close();

	}

}