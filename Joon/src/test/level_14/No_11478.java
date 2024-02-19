package test.level_14;

import java.io.*;
import java.util.*;

public class No_11478 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			String str = "";
			for(int j=i; j<s.length(); j++) {
				str += s.substring(j, j+1);
				set.add(str);
			}
		}
		
		bw.write(set.size() + "\n");
		bw.flush();
		bw.close();
		
	}

}
