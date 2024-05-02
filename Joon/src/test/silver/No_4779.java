package test.silver;

import java.io.*;

public class No_4779 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			if(str == null || str.isBlank()) break;
			int N = Integer.parseInt(str);
			int length = (int) Math.pow(3, N);
			boolean[] arr = new boolean[length];
			arr = div(arr, 1, length);
			for(int i=0; i<length; i++) {
				String s = arr[i] ? " " : "-";
				bw.write(s+"");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	static boolean[] div(boolean[] arr, int init, int end) {
		if(init>=end) return arr;
		for(int i=0; i<end; i++) {
			if(i/init%3==1) arr[i] = true;
		}
		init *= 3;
		return div(arr, init, end);
	}

}
