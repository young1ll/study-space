//package baekjoon;
//mathBasic
// 1   2   6   7  15  16
// 3   5   8  14  17 
// 4   9  13  18 
//10  12  19 
//11  20
//21
// https://www.acmicpc.net/board/view/105525

import java.util.Scanner;

public class BAEKJOON_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		int col = (int)(Math.ceil( (-1 + Math.sqrt(1 + 8*idx))/2 - 1 ) + 1);
		idx -= (col * (col - 1)/2);
		if(col%2 != 0) System.out.println((col+1-idx)+"/"+idx);
		else System.out.println(idx+"/"+(col+1-idx));
	}

}
