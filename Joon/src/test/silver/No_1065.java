package test.silver;

import java.io.*;

public class No_1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=1; i<=N; i++) {
			String[] hansu = Integer.toString(i).split("");
			int hansuLength = hansu.length;
			if(hansuLength<3) {
				count++;
			} else {
				int d = Integer.parseInt(hansu[1]) - Integer.parseInt(hansu[0]);
				for(int j=2; j<hansuLength; j++) {
					if(Integer.parseInt(hansu[j])== Integer.parseInt(hansu[j-1]) + d) count++;
				}
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();

	}

}
