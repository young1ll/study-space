package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_15651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] narr = new int[n];
		
		for(int i=0; i<n; i++) narr[i] = i+1;
		System.out.println(Arrays.toString(narr));
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(narr[i] +" "+ narr[j] +" ");
				System.out.println();
			}
		}
		
	}
}
