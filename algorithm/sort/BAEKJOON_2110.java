import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_2110 {
    public static void main(String[] args) {
        // 단 두 개라면, 양 끝에 설치하는 것이 가장 멀 것이다.
        // 세 개라면, 양 끝과 중간 어딘가에 설치하는 것이 옳을 것이다.
        // 갯수가 늘어나도, 양 끝은 항상 설치하게 된다.

        // 따라서 정렬 후, 가운데 어딘가에 설치하게 됐을 때,
        // 모든 인접하게 설치된 공유기 중 가장 먼 거리를 찾으면 된다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int start = 0, end = arr.length, mid = (start + end) / 2; 
        for(int i=0; i < arr.length; i++) {
            
        }
    }
}