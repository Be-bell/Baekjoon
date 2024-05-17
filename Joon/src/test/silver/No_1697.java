package test.silver;

import java.io.*;
import java.util.*;

public class No_1697 {
	
	static int minValue = Integer.MAX_VALUE;
	static int n, k;
	static int maxValue = 100000;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		visited = new boolean[maxValue+1];
		bfs();
		
		bw.write(minValue + "\n");
		bw.flush();
		bw.close();

	}
	
	static void bfs() {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(n, 0));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			visited[node.num] = true;
			
			if(node.num == k) minValue = Math.min(minValue, node.time);
			int nextTime = node.time+1;
			
			if(node.num*2 <= maxValue && !visited[node.num * 2]) {
				q.offer(new Node(node.num*2, nextTime));
			}
			if(node.num+1 <= maxValue && !visited[node.num + 1]) {
				q.offer(new Node(node.num+1, nextTime));
			}
			if(node.num-1 >= 0 && !visited[node.num - 1]) {
				q.offer(new Node(node.num-1, nextTime));
			}
		}
	}
	
	public static class Node {
		int num;
		int time;
		
		public Node(int n, int time) {
			num = n;
			this.time = time;
		}
		
	}

}
