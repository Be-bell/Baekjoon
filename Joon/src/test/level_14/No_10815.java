package test.level_14;

import java.io.*;
import java.util.*;

public class No_10815 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) set.add(Integer.parseInt(st.nextToken()));
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<M; j++) {
			if(set.contains(Integer.parseInt(st.nextToken()))) bw.write("1 ");
			else bw.write("0 ");
		}
		
		bw.flush();
		bw.close();
		
	}

}
