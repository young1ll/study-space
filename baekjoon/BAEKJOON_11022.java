package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println("Case #"+ i +": "+ a +" + "+ b +" = "+ (a+b));
			}
		}
	}
}
