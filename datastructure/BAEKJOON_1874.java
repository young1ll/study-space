package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BAEKJOON_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();//출력 준비
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int start = 0;
		
		while(n --> 0) {
			int v = Integer.parseInt(br.readLine());
			if(v>start) {//입력 값이 stack.peek()보다 큰 경우
				for(int i=start+1; i<=v; i++) {
					stack.push(i);
					sb.append('+').append('\n');//push 실행 시 + 저장
				} start = v;//stack.peek()
			}
			else if(stack.peek() != v) {
				System.out.println("NO"); return;
			}
			stack.pop(); //입력 값이 stack.peek()이 작은 경우
			sb.append('-').append('\n');
		}//while
		
		System.out.println(sb);
	}//main
}
