package test.silver;

import java.io.*;
import java.util.*;

public class No_20920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str1 = br.readLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		int M = Integer.parseInt(str1[1]);
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			if(s.length() < M) continue;
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		List<String> words = new ArrayList<>(map.keySet());
		
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				// 빈도수 비교
				if(Integer.compare(map.get(o1), map.get(o2)) != 0) {
					return Integer.compare(map.get(o2), map.get(o1));
				}
				
				// 길이 비교
				if(o1.length() != o2.length()) {
					return o2.length() - o1.length();
				}
				
				// 단어 스펠링 비교
				return o1.compareTo(o2);
			}
		});
		
		for(String str : words) {
			bw.write(str + "\n");
		}
		bw.flush();
		bw.close();
	}

}
