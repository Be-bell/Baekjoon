package test.gold;

import java.io.*;

public class No_17205 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long sec = 1;
		//첫 글자와 문자열의 길이 추출
		int len = str.length();
		int string = str.charAt(0) - 97;
		
		// 첫 글자가 a가 아니면 다음과 같이 계산해서 더해줌. 예를 들어 N이 3이고 첫글자가 b이면 (98-97)*(26^2 + 26^1 + 26^0)을 더함.
		for(int i=0; i<N; i++) {
			sec += string * ((long) Math.pow(26, N-i-1));
		}
		
		// 첫 글자 이외에 다음글자부터는 a가 아니면 중복순열을 이용해 더해주고, a이면 그냥 개수만 더함.
		for(int j=1; j<len; j++) {
			if(str.charAt(j) != 'a') {
				string = str.charAt(j) - 96;
				sec += string * ((long) Math.pow(26, N-j-1));
			} else {
				sec++;
			}
		}
		
		bw.write(sec + "\n");
		bw.flush();
		bw.close();
		
	}

}
