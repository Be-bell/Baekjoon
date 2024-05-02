package test.bronze;

import java.io.*;

public class No_25501 {
	
	static int recursionCount;
	
	public static int Recursion(String s, int left, int right){
		recursionCount++;
        if(left >= right) return 1;
        else if(s.charAt(left) != s.charAt(right)) return 0;
        else return Recursion(s, left+1, right-1);
    }
	
    public static int IsPalindrome(String s){
        return Recursion(s, 0, s.length()-1);
    }

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			recursionCount=0;
			String s = br.readLine();
			int isPalindrome = IsPalindrome(s);
			bw.write(isPalindrome + " " + recursionCount + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
