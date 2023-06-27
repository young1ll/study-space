import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BAEKJOON_1715 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
      Queue<Long> queue = new PriorityQueue<>();
      // 자료구조 주의...
      for(int i=0; i < n; i++) queue.add(sc.nextLong());
      sc.close();

      long result = 0;
      
      
      while(queue.size() > 1) {
         long num = 0;
         num = queue.poll() + queue.poll();
         queue.add(num);
         result += num;
      }
      
      System.out.println(result);
   }
}