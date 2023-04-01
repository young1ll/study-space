//package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int[] nArr = new int[n];
		for(int i=0; i<nArr.length; i++) nArr[i] = i+1;
		
		for(int i=0; i<m; i++) {
			StringTokenizer nums = new StringTokenizer(bf.readLine());
			int num1 = Integer.parseInt(nums.nextToken())-1;
			int num2 = Integer.parseInt(nums.nextToken())-1;
			
			int temp = nArr[num1];
			nArr[num1] = nArr[num2];
			nArr[num2] = temp;
		}
		
		for(int i=0; i<nArr.length; i++) System.out.print(nArr[i]+" ");
	}
}