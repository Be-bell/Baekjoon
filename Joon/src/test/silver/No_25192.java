package test.silver;

import java.io.*;
import java.util.*;

public class No_25192 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = null;
		int gomCount = 0;
		for(int i=0; i<N; i++) {
			String chatLog = br.readLine();
			if(chatLog.equals("ENTER")) {
				set = new HashSet<>();
			} else {
				if(!set.contains(chatLog)) {
					set.add(chatLog);
					gomCount++;
				}
			}
		}
		bw.write(gomCount + "\n");
		bw.flush();
		bw.close();
	}

}
