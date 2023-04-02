import java.util.*;
public class BAEKJOON_11047 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] coins = new int[n];
      int result = 0;
      
      for(int i=0; i < n; i++) coins[i] = sc.nextInt();
      
      int max = coins[0];
      
      while(k > 0) { //부등호 주의
        for(int i=0; i < coins.length; i++) max = coins[i] <= k ? coins[i] : max;
        
        result += k/max;
        k = k%max;
      }
      
      
      System.out.println(result);
      sc.close();
    }
}