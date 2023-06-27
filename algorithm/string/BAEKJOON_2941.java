//string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			char current = str.charAt(i);
			char next = i+1 < str.length() ? str.charAt(i+1) : '\0'; //오류 방지
			char aftNext = i+2 < str.length() ? str.charAt(i+2) : '\0'; //오류 방지
			
			if(current == 'c' && (next == '=' || next == '-')) { i++; cnt++; }
			else if(current == 'd' && next == '-') { i++; cnt++; }
			else if(current == 'd' && (next == 'z' && aftNext == '=')) { i+=2; cnt++; }
			else if((current == 'l' || current == 'n') && next == 'j') { i++; cnt++; }
			else if((current == 's' || current == 'z') && next == '=') { i++; cnt++; }
			else cnt++;
			
		}
		System.out.println(cnt);
	}

}
