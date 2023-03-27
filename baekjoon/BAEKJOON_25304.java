package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sum += a*b;
			}
		}
		if(x == sum) System.out.println("Yes");
		else System.out.println("No");
	}

}
