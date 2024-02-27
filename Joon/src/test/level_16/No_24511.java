package test.level_16;

import java.io.*;
import java.util.*;

public class No_24511 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[] isQueue = new boolean[N];
		Deque<Integer> queue = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) if(Integer.parseInt(st.nextToken())==0) isQueue[i]=true;
		
		String[] B = br.readLine().split(" ");
		for(int i=0; i<N; i++) if(isQueue[i]) queue.offer(Integer.parseInt(B[i]));
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<M; j++) {
			queue.offerFirst(Integer.parseInt(st.nextToken()));
			bw.write(queue.pollLast() + " ");
		}
		
		bw.flush();
		bw.close();

	}

}
