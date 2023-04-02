import java.util.*;
public class BAEKJOON_13305 {
    // 방법 1 : 17점
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] r = new int[n-1];
    //     int[] c = new int[n];
    //     int result = 0;
        
    //     for(int i=0; i < r.length; i++) r[i] = sc.nextInt();
    //     for(int i=0; i < c.length; i++) c[i] = sc.nextInt();
    //     sc.close();    
    //     for(int i=0; i < r.length; i++) {
    //         if(c[i] >= c[i+1]) result += c[i] * r[i];
    //         if(c[i] < c[i+1]) {
    //             result += c[i] * (r[i] + r[i+1]);
    //             i++;
    //         }
    //     }
    //     System.out.println(result);
    // }

    // 방법 2 : 58점
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] r = new int[n-1];
    //     int[] c = new int[n];
    //     int result = 0;
        
    //     for(int i=0; i < r.length; i++) r[i] = sc.nextInt();
    //     for(int i=0; i < c.length; i++) c[i] = sc.nextInt();
    //     sc.close();
        
    //     for(int i=0; i < r.length; i++) {
    //         if(c[i] < c[i+1]) c[i+1] = c[i];
            
    //         result += c[i] * r[i];
    //     }
    //     System.out.println(result);
    // }

    //방법 3 : 100점
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] r = new long[n-1];
        long[] c = new long[n];
        long result = 0;
        
        for(int i=0; i < r.length; i++) r[i] = sc.nextInt();
        for(int i=0; i < c.length; i++) c[i] = sc.nextInt();
        sc.close();
        long min = c[0];
        
        for(int i=0; i < r.length; i++) {
            if(c[i] < min) min = c[i];
            
            result += min * r[i];
        }
        System.out.println(result);
    }
}