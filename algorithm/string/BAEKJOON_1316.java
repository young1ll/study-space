//string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=0; i<num; i++) {
			String st = br.readLine();
			boolean flag = true;
			
			if(st.length() == 1) flag = true;
			for(int j=0; j<st.length(); j++) {
				for(int k=j+1; k<st.length(); k++) {
					//결국 조건문이 핵심이었다.
					if(k-j > 1 && st.charAt(j) != st.charAt(j+1) && st.charAt(j) == st.charAt(k)) {
						flag = false;
						break; //break문 작성 때문에 오답 제출 여러번
					} else { flag = true; }
				}//for k
				if(!flag) break;
			}//for j
			if(flag) cnt++;
			
		}//for i -> readLine()
		System.out.println(cnt);
	}
}