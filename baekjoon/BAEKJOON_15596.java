package baekjoon;

import java.util.Arrays;

public class BAEKJOON_15596 {
	public static void main(String[] args) {
		int[] arr = new int[3000000];
		//arr[0] = 3000000;
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1000000;
		}
		System.out.println(Arrays.toString(arr));
		
		Test a = new Test();
		long all = a.sum(arr);
		
		System.out.println(all);
	}
	
	
}
class Test {
	
	long sum(int[] a) {
		long ans = 0;
		if(a.length <= 3000000) {
			for(int i=0; i<a.length; i++) {
				ans = a[i] >= 1 && a[i] <= 1000000 ? ans += a[i] : ans;
			}//for			
		}
		return ans;
	}//sum
}
