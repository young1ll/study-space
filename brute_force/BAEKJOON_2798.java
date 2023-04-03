//참고 : https://montoo.tistory.com/entry/Near-Algoritm-%EA%B7%BC%EC%82%AC%EA%B0%92-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
import java.util.Scanner;

public class BAEKJOON_2798 {
	// 전체 카드 1~21
	// 근사값 : 차잇값의 절대값 중 최소 값
	public static int Abs(int num) {
		return (num < 0) ? -num : num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); //target
		int[] arr = new int[n];
		for(int i=0; i < n; i++) arr[i] = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int near = 0;
		for(int i=0; i < arr.length-2; i++) {
			for(int j=i+1; j < arr.length-1; j++) {
				for(int k=j+1; k < arr.length; k++) {
					
					int sum = arr[i]+arr[j]+arr[k];
					int abs = Abs(sum - m);
					if(sum <= m) {
						if(abs < min) {
							min = abs;
							near = sum;
						}						
					}
				}
			}
		}
		System.out.println("near: "+ near);
	}
}
