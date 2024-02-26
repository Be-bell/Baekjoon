package test.level_16;

import java.io.*;
import java.util.*;

public class No_11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> josephus = new LinkedList<>();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) queue.offer(i);
		
		while(!queue.isEmpty()) {
			for(int j=1; j<K; j++) queue.offer(queue.poll());
			josephus.offer(queue.poll());
		}
		
		System.out.print("<");
		while(josephus.size()>1) System.out.print(josephus.poll()+", ");
		System.out.print(josephus.poll() + ">");

	}

}
