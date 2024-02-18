package test.level_14;

import java.io.*;
import java.util.*;

public class No_1764 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<N; i++) set.add(br.readLine());
		
		ArrayList<String> list = new ArrayList<>();
		for(int j=0; j<M; j++) {
			String s = br.readLine();
			if(set.contains(s)) list.add(s);
		}
		
		Collections.sort(list);
		bw.write(list.size() + "\n");
		for(int k=0; k<list.size(); k++) {
			bw.write(list.get(k) + "\n");
		}
		bw.flush();
		bw.close();

	}

}
