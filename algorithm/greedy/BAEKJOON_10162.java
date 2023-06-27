import java.util.Scanner;

public class BAEKJOON_10162 {
    /*
     * a 5m = 300
     * b 1m = 60
     * c 10
     * a + b + c = T
     * cnt = abc를 더한 횟수
     * 최소 cnt
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        int a = 0, b = 0, c = 0;
        
        if(n%10 != 0) System.out.println(-1);
        else {
            while(n > 0) {
                if(n >= 300) {
                    a += n / 300;
                    n = n % 300;
                }
                else if(n < 300 && n >= 60) {
                    b += n / 60;
                    n = n % 60;
                }
                else if(n < 60 && n >=0) {
                    c += n / 10;
                    n = n % 10;
                }
            }
            System.out.println(a +" "+ b +" "+ c);
        }
    }
}
