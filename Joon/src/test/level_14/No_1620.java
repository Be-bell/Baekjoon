package test.level_14;

import java.io.*;
import java.util.*;

public class No_1620 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> pokemon = new HashMap<>();
		for(int i=1; i<=N; i++) pokemon.put(i, br.readLine());
		
		for(int j=0; j<M; j++) {
			String s = br.readLine();
			try {
				bw.write(pokemon.get(Integer.parseInt(s)) + "\n");
			} catch(NumberFormatException e) {
				for(int key : pokemon.keySet()) {
					if(s.equals(pokemon.get(key))) bw.write(key + "\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		
	}
	
	

}
