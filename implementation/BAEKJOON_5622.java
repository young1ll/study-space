//string;
/*
 * 다이얼을 걸기 위한 최소 시간 구하기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BAEKJOON_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
		    if(ch >= 'A' && ch <= 'C') num[i] = 2;
		    else if(ch >= 'D' && ch <= 'F') num[i] = 3;
		    else if(ch >= 'G' && ch <= 'I') num[i] = 4;
		    else if(ch >= 'J' && ch <= 'L') num[i] = 5;
		    else if(ch >= 'M' && ch <= 'O') num[i] = 6;
		    else if(ch >= 'P' && ch <= 'S') num[i] = 7;
		    else if(ch >= 'T' && ch <= 'V') num[i] = 8;
		    else if(ch >= 'W' && ch <= 'Z') num[i] = 9;
		}
		
		int sec = 0;
		for(int i=0; i<num.length; i++) {
			sec++;
			sec += num[i];
		} System.out.println(sec);
	}

}
