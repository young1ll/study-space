package baekjoon;

import java.io.*;
import java.util.Arrays;

public class BAEKJOON_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		
		char[] chArr = sb.toString().toCharArray();
		Arrays.sort(chArr);
		for(int i=0, j=chArr.length-1; i<chArr.length; i++, j--) {
			sb.setCharAt(i, chArr[j]);
		}
		System.out.println(sb);
	}
}
