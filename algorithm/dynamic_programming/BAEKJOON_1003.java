//미해결
import java.util.Scanner;

public class BAEKJOON_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[sc.nextInt()];
		
		for(int i=0; i < nums.length; i++) nums[i] = sc.nextInt();
		
		fibo(nums);
	}
	//1 1 2 3 5 8
	public static void fibo(int[] nums) { //Helper
		for(int i=0; i < nums.length; i++) {
			int n = nums[i];
			fibo(n, 0, 0);
			System.out.println();
		}
	}
	public static void fibo(int n, int z, int o) {
		if(n == 0) {
			z++;
		}
		else if(n == 1) {
			o++;
		}
		fibo(n-1, z, o);
		System.out.print(z +" "+ o);
	}
}
