//package baekjoon;

import java.util.Scanner;

public class BAEKJOON_1065 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scN = sc.nextInt();
		System.out.println(dnCounter(scN));
	}//main

	public static int dnCounter(int n) {
		int cnt =0;
		
		for(int i=1; i<=n; i++) {
			if(i < 100) cnt++; //100 미만인 경우  
			else if(i >= 100) { //100 이상인 경우
				String str = Integer.toString(i);
				int[] dn = new int[str.length()];

				//for : 배열 dn에 각 자리의 값 저장
				for(int j = 0; j<str.length(); j++) dn[j] = str.charAt(j)-'0';

				int[] dArr = new int[dn.length-1];
				//for : 배열 dn의 공차를 dArr에 저장
				for(int j = 0; j<dArr.length; j++) dArr[j] = (dn[j+1] - dn[j]);


				//공차를 검사해야 한다
				for(int j=0; j<dArr.length-1; j++) {
					if(dArr[j] != dArr[j+1]) break;
					else cnt++;
					}
				}//else
			}//for
		
		return cnt;
	}//dnCounter
}

/*
 * public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[3];
        for(int i=1;i<=a;i++){
            if(i==1000){
                cnt = 144;
                break;
            } else if(i<100){
                cnt++;
            } else {
                arr[0] = i/100;
                arr[1] = i/10 - (arr[0]*10);
                arr[2] = i%10;
                
                if(arr[0] - arr[1] == arr[1] - arr[2]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
 */