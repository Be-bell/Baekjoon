package test.gold;

import java.io.*;
import java.util.*;

public class No_13549 {
	
	static int minValue = Integer.MAX_VALUE;
	static int n, k;
	static int maxValue = 100000;
	static boolean[] isvisited;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		isvisited = new boolean[maxValue+1];
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
			isvisited[node.num] = true;
			if(node.num == k) minValue = Math.min(minValue, node.time);
			
			if(node.num * 2 <= maxValue && isvisited[node.num * 2] == false) q.offer(new Node(node.num*2, node.time));
			if(node.num + 1 <= maxValue && isvisited[node.num + 1] == false) q.offer(new Node(node.num+1, node.time + 1));
			if(node.num - 1 >= 0 && isvisited[node.num - 1] == false) q.offer(new Node(node.num-1, node.time+1));
		}
	}
	
	public static class Node {
		int num;
		int time;
		
		Node(int n, int time) {
			num = n;
			this.time = time;
		}
	}
}




