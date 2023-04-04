import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_1541 {
    /*
     * +, -, (, )
     * 0~9, +, -
     * 최소
     * 연산자는 연속하지 않는다
     * 숫자는 5자리 미만, 0으로 시작하지 않는다.
     * 50이하
     * 괄호를 어디에 : 빼는 숫자가 커야한다.
     * + 만 있다면, -만 있다면 상관없음
     * n + n - n : n + (n - n)...
     * n - n + n : n - (n + n)...
     * 
     * 빼는 값을 최대한으로 만들기
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(br.readLine());
        char[] sArr = s.toCharArray();

        for(int i=0; i < sArr.length; i++) {
            if(sArr[i] == '-')
            System.out.println(sArr[i]);
        }
    }
}
