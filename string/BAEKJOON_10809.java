import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BAEKJOON_10809 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();//어떤 단어 입력
		StringBuilder strB = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (strB.indexOf(String.valueOf(c)) == -1) {
        		strB.append(c);
			}
			else strB.append('0');
		}
		
		for(int i=97; i<123; i++) {
			boolean checker = false;
			for(int j=0; j<strB.length(); j++) {
				if(strB.charAt(j) == i) {
					System.out.print(j + " ");
					checker = true;
					break;
				}
			}
			if(!checker) {
				System.out.print("-1 ");
			}
		}
	}//main
}