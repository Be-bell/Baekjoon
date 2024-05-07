package test.silver;

import java.io.*;
import java.util.*;

public class No_11723 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		HashSet<Integer> set = new HashSet<>();
		
		
		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int num;
			String order = st.nextToken();
			
			switch(order) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				if(!set.contains(num)) {
					set.add(num);
				}
				break;
				
			case "check":
				num = Integer.parseInt(st.nextToken());
				if(set.contains(num)) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
				
			case "remove":
				num = Integer.parseInt(st.nextToken());
				if(set.contains(num)) {
					set.remove(num);
				}
				break;
				
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				if(set.contains(num)) {
					set.remove(num);
				} else {
					set.add(num);
				}
				break;
				
			case "all":
				HashSet<Integer> add = new HashSet<>();
				for(int j=1; j<=20; j++) {
					add.add(j);
				}
				set = add;
				break;
				
			case "empty":
				set = new HashSet<>();
				break;
				
			}
		}
		
		bw.flush();
		bw.close();

	}

}
