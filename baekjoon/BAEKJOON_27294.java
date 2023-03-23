package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BAEKJOON_27294 { //m
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		getRicesNum(a, b);
	}
    
	public static void getRicesNum(int t, int s) {
		int r=0;
		if(!(t > 11 && t < 17)) r = 280; //점심 시간이 아니면
		else {
			if(s == 1) r = 280;
			else r = 320;
		}
		
		System.out.println(r);;
	}
}