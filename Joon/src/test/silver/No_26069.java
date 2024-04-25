package test.silver;

import java.io.*;
import java.util.*;

public class No_26069 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			if(set.contains(s[0])) {
				set.add(s[1]);
			} else if (set.contains(s[1])) {
				set.add(s[0]);
			}
		}
		
		bw.write(set.size() + "\n");
		bw.flush();
		bw.close();

	}

}
