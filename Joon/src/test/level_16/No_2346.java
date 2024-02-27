package test.level_16;

import java.io.*;
import java.util.*;

public class No_2346 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> stack = new ArrayDeque<>();
		Deque<Integer> balloon_num = new ArrayDeque<>();
		
		for(int i=1; i<=N; i++) {
			stack.offer(Integer.parseInt(st.nextToken()));
			balloon_num.offer(i);
		}
		
		while(stack.size()>1) {
			int count = stack.poll();
			int num = balloon_num.poll();
			bw.write(num + " ");
			if(count>0) {
				for(int j=1; j<count; j++) {stack.offer(stack.poll());
					balloon_num.offer(balloon_num.poll());
					}	
				} else {
					for(int j=0; j<Math.abs(count); j++) {
						stack.offerFirst(stack.pollLast());
						balloon_num.offerFirst(balloon_num.pollLast());
					}
				}
			}
		
		bw.write(balloon_num.poll() + "\n");
		bw.flush();
		bw.close();
		
	}
}
