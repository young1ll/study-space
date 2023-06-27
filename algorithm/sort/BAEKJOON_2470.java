import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON_2470 {
    // 산성용액
    // 알칼리용액

    // 두 용액의 합이 0에 가깝게
    // [-2, 4, -99, -1, 98] => -99, 98 : -1
    // 경우에 따라, -만, +만 사용할 수도 있음
    
    // facts
    // - 부호를 빼고 정렬했을 때 가장 차가 작은 두 수.
    //      - 이 경우 빠르게 답을 찾을 수 있는 알고리즘 필요?
    // - 오름차 또는 내림차 정렬 후, 가장 큰 수와 가장 작은 수
    //      - 이 경우 [-99, -2, -1, 4, 98]의 정답을 도출하지만,
    //        [100, 1, -1, -2, -4] 의 올바른 답을 도출하지 못함.

    // for문을 사용할 경우, 이중 for문으로 두 수를 뽑아야 한다.
    // 이중 for문이 아니어도, pointer를 조건에 따라 따로 이동시켜야 한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] nArr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        } br.close();

        Arrays.sort(nArr);
        long a = nArr[0], b = nArr[nArr.length-1]; // 첫번째와 마지막 값을 초기값으로 지정
        long min = Math.abs(a + b); // 초기값의 절대값을 min으로 지정

        int left = 0, right = nArr.length-1; // pointer
        while(left < right) {
            long sum = nArr[left] + nArr[right];
            long abs = Math.abs(sum);
            if(abs < min) { // 새로운 최솟값을 찾으면 갱신
                min = abs;
                a = nArr[left];
                b = nArr[right];
            }
            // 조건(음수, 양수)에 따라 pointer 변경
            if(sum < 0) left++; // 합이 음수일 경우 left 증가
            else right--; // 합이 양수일 경우 right 감소
        }
        System.out.println(a +" "+ b);
    }
}
