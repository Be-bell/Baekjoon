package test.level_16;

import java.util.*;
import java.io.*;

public class No_18258 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int X = 0;
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String Order = st.nextToken();
			
			switch(Order) {
			case "push" :
				X = Integer.parseInt(st.nextToken());
				queue.offer(X);
				break;
			
			case "pop" :
				if(queue.isEmpty()) bw.write("-1\n");
				else bw.write(queue.poll() + "\n");
				break;
			
			case "size" :
				bw.write(queue.size() + "\n");
				break;
			
			case "empty" :
				if(queue.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
				break;
				
			case "front" :
				if(queue.isEmpty()) bw.write("-1\n");
				else bw.write(queue.peek() + "\n");
				break;
				
			case "back" :
				if(queue.isEmpty()) bw.write("-1\n");
				else bw.write(X + "\n");
				break;

			}
		}
		
		bw.flush();
		bw.close();

	}

}
