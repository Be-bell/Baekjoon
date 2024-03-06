package test.silver;

import java.io.*;
import java.util.*;

public class No_1002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());
			if(x1==x2 && y1==y2) {
				if(r1==r2) bw.write(-1 + "\n");
				else bw.write(0 + "\n");
			} else {
				double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
				double rmax = Math.max(r1, r2);
				double rmin = Math.min(r1, r2);
				if(distance>rmax) {
					if(distance>rmax+rmin) bw.write(0 + "\n");
					else if(distance<rmax+rmin) bw.write(2 + "\n");
					else bw.write(1 + "\n");
				} else if(distance<rmax) {
					if(rmax>distance+rmin) bw.write(0 + "\n");
					else if(rmax<distance+rmin) bw.write(2 + "\n");
					else bw.write(1 + "\n");
				} else bw.write(2 + "\n");
			}
		}
		
		bw.flush();
		bw.close();

	}

}
