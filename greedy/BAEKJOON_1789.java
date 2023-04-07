import java.util.Scanner;

public class BAEKJOON_1789 {
    /*
     * ::Hint::
     * 특정 수가 주어지면
     * 1부터 주어진 수까지 더하며, cnt를 센다.
     * 더한 수와 주어진 수가 일치하면 계산을 멈추고 cnt를 반환한다.
     * + 입력 값과 자료형 일치
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong(), sum = 0, cnt = 0;
        sc.close();
        for(int i=1; i <= s; i++) {
            sum += i;
            if(sum > s) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
