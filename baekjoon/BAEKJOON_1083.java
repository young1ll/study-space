package baekjoon;
/*
 * 
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 10 9 1
 * 1 2 3 4 5 6 7 10 8 9 2
 * 1 2 3 4 5 6 10 7 8 9 3
 * 1 2 3 4 5 10 6 7 8 9 4
 * 1 2 3 4 10 5 6 7 8 9 5
 * 1 2 3 10 4 5 6 7 8 9 6
 * 1 2 10 3 4 5 6 7 8 9 7
 * 1 10 2 3 4 5 6 7 8 9 8
 * 10 1 2 3 4 5 6 7 8 9 9
 * 
 * 10 1 2 3 4 5 6 7 9 8 10
 * 10 1 2 3 4 5 6 9 7 8 11
 * 10 1 2 3 4 5 9 6 7 8 12
 * 10 1 2 3 4 9 5 6 7 8 13
 * 10 1 2 3 9 4 5 6 7 8 14
 * 10 1 2 9 3 4 5 6 7 8 15
 * 10 1 9 2 3 4 5 6 7 8 16
 * 10 9 1 2 3 4 5 6 7 8 17
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1083 {
	public static void main(String[] args) throws IOException {
	
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    int[] a = new int[N];
	    StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());
	    
	    int s = Integer.parseInt(br.readLine());
	    
	    bSort(a, s);
	    for(int i=0; i<a.length; i++) System.out.print(a[i] + " ");
	}
	
	public static void bSort(int[] a, int s) {
		for(int i=0; i<a.length && s>0; i++) { // 배열 길이 만큼 패스 반복
			int max = i;//패스마다 i값으로 max 초기화
			for(int j=i; j<=i+s && j<a.length; j++) {//i값 부터 검사
				if(a[max] < a[j]) max = j;
			}
			for(int k=i+1; k <= max; k++) swap(a, k, i);
			s -= max-i;//교환횟수 차감
		}
	}
	
	public static void swap(int[] a, int i, int j) {
	    int tmp = a[i];
	    a[i] = a[j];
	    a[j] = tmp;
	}
}
