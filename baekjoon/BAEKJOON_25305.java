//package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());//상 받는 인원
		int[] arr = new int[n];
		
		if((n>0 && n<=1000) && (k >= 1 && k <= n)) {
		    StringTokenizer st2 = new StringTokenizer(br.readLine());
		    if(st2.countTokens()!=n) return;
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(st2.nextToken());
		        if(arr[i]<0 || arr[i]>10000) return;
		    }
		    for(int i=0; i<arr.length-1; i++) {
		        int tmp=i;
		        for(int j=i+1; j<arr.length; j++) {
		            if(arr[tmp] <= arr[j]) tmp = j;
		        }
		        int temp = arr[i];
		        arr[i] = arr[tmp];
		        arr[tmp] = temp;
		    }
		}
		System.out.println(arr[k-1]);
	}
}
