import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BAEKJOON_11652 {
    // 카드
    // 주어진 정수 중 가장 많은 수
    // 낮은 수가 우선
    // 배열로 구성
    // 최댓값 구하기
    // 기수정렬에서 index를 활용하는 것과 유사하게 중복된 정수의 index를 count

    // 2^62는 int 인덱스 범위를 벗어나므로 Map으로 구현
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Integer> map = new HashMap<>();

        for(int i=0; i < n; i++) {
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        long maxNum = 0;
        int maxCnt = 0;
        for(Map.Entry<Long, Integer> en : map.entrySet()) {
            long num = en.getKey();
            int cnt = en.getValue();

            if(cnt > maxCnt || (cnt == maxCnt && num < maxNum)) {
                maxNum = num;
                maxCnt = cnt;
            }
        }

        System.out.println(maxNum);
    }
}
