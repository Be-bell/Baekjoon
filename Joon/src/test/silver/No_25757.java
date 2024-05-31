package test.silver;

import java.io.*;
import java.util.*;

public class No_25757 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int maxPlayNum = 0;
		
		switch(st.nextToken()) {
		case "Y" :
			maxPlayNum = 1;
			break;
		case "F" :
			maxPlayNum = 2;
			break;
		case "O" :
			maxPlayNum = 3;
			break;
		}
		
		HashSet<String> playBefore = new HashSet<>();
		Stack<String> players = new Stack<>();
		int playCount = 0;
		
		for(int i=0; i<N; i++) {
			String player = br.readLine();
			
			if(playBefore.contains(player)) {
				continue;
			}
			
			players.push(player);
			
			if(players.size() == maxPlayNum) {
				while(!players.isEmpty())
					playBefore.add(players.pop());
				playCount++;
			}
		}
		
		bw.write(playCount + "\n");
		bw.flush();
		bw.close();
		
	}
}
