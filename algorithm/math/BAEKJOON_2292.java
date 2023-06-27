//mathBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_2292 {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int r = 2;
		
		if(num == 1) System.out.println(1);
		else {
			while(r <= num) {
				r = r+(6*cnt);
				cnt++;
			} System.out.println(cnt);
		}//else
	}
}
