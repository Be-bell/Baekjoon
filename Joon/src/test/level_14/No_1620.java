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
		
		HashMap<Integer, String> pokemon_name = new HashMap<>();
		HashMap<String, Integer> pokemon_num = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			String name = br.readLine();
			pokemon_name.put(i, name);
			pokemon_num.put(name, i);
		}
		
		for(int j=0; j<M; j++) {
			String s = br.readLine();
			try {
				bw.write(pokemon_name.get(Integer.parseInt(s)) + "\n");
			} catch(NumberFormatException e) {
				bw.write(pokemon_num.get(s) + "\n");
				}
			}
		
		bw.flush();
		bw.close();
		
	}
	
}
