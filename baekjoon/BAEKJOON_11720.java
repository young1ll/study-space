package baekjoon;
//string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//첫째줄 숫자의 갯수
		int sum = 0;
		
		String str = br.readLine().substring(0, num);// num으로 str 길이 제한
		for(int i=0; i<num; i++) sum += str.charAt(i)-'0';
		System.out.println(sum);
	}//main
}
