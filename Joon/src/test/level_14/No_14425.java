package test.level_14;

import java.io.*;
import java.util.*;

public class No_14425 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<N; i++) set.add(br.readLine());
		
		int count = 0;
		
		for(int j=0; j<M; j++) if(set.contains(br.readLine())) count++;
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();

	}

}
