//package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://developer-talk.tistory.com/674 참고
//https://www.acmicpc.net/problem/14425 문제
public class BAEKJOON_14425 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nm = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(nm.nextToken()), m = Integer.parseInt(nm.nextToken());
		String[] nstr = new String[n], mstr = new String[m];
		for(int i=0, j=0; i < n; i++) nstr[i] = br.readLine();
		for(int i=0, j=0; i < m; i++) mstr[i] = br.readLine();

		int cnt = 0 ;
		for(int i=0; i < nstr.length; i++) {
			for(int j=0; j < mstr.length; j++) if(nstr[i].equals(mstr[j])) cnt++;
		}System.out.println(cnt);
	}
}
