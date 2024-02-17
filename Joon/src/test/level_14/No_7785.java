package test.level_14;

import java.util.*;
import java.io.*;

public class No_7785 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<String> log = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			boolean enter = (st.nextToken().equals("enter") ? true : false);
			if(enter) log.add(name);
			else log.remove(name);
		}
		
		ArrayList<String> list = new ArrayList<String>(log);
		Collections.sort(list, Collections.reverseOrder());
		
		for(int j=0; j<list.size(); j++) bw.write(list.get(j) + "\n");
		bw.flush();
		bw.close();
		
	}

}
