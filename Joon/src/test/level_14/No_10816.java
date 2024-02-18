package test.level_14;

import java.io.*;
import java.util.*;

public class No_10816 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] keys = new int[M];
		for(int j=0; j<M; j++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, 0);
			keys[j] = key;
		}
		
		for(int i=0; i<N; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				count++;
				map.replace(arr[i], count);
			}
		}
		
		for(int j=0; j<M; j++) bw.write(map.get(keys[j]) + " ");
		bw.flush();
		bw.close();

	}

}
