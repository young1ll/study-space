import java.util.Scanner;
import java.util.Stack;
//N과 M (2)
public class BAEKJOON_15650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		backT(n, m, stack, 1);
	}
	public static void backT(int n, int m, Stack<Integer> stack, int s) {
		if(stack.size() == m) //출력
			System.out.println(stack.toString().replaceAll("\\[|\\]|,", ""));
		else if(stack.size() > m) return;
		
		for(int i=s; i<=n; i++) { //반복횟수 주의
			stack.push(i); //입력
			backT(n, m, stack, i+1);
			stack.pop();
		}
	}//backT
}
