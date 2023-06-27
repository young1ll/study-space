import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 순열(Permutation)
 */
public class BAEKJOON_15649 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = new int[n];
		
		for(int i=1; i<=n; i++) {
			arr[i-1] = i;
		}
		backT(stack, arr, m);
	}//main


	public static void backT(Stack<Integer> stack, int[] arr, int m) {
		if (stack.size() == m) {
			System.out.println(stack.toString().replaceAll("\\[|\\]|,", ""));//regex
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (stack.contains(arr[i])) {//stack 검사
					continue;//exit for
				}
				stack.push(arr[i]);
				backT(stack, arr, m);//recur
				stack.pop();
			}//for i
		}
	}//backT
}
