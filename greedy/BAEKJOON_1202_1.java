import java.io.*;
import java.util.*;

public class BAEKJOON_1202 {
   static class Item implements Comparable<Item> {
      int m, v;
   
      public Item(int m, int v) {
         this.m = m;
         this.v = v;
      }
      public int CompareTo(Item o) {
         return this.m - o.m;
      }
	@Override
	public int compareTo(Item o) {
		return 0;
	}
   }
   
   public static void main(String[] args) throws IOException {
      // 풀이 2
      // 기본 정수형 오름차 순 정렬을 제공하는 Heap : PriorityQueue를 이용해 풀 수도 있다고 한다.
      // 즉 이진탐색트리를 구현이라는 뜻.
      // 풀이 1에서 map만 정렬하고 list는 pointer를 이용해 최적값을 선별한다.
      //===========================================================
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
      
      Item[] items = new Item[n]; //Object
      for(int i=0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         int m = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
         items[i] = new Item(m, v);
      }
      Arrays.sort(items);

      int[] bags = new int[k];
      for(int i=0; i <k; i++) {
         bags[i] = Integer.parseInt(br.readLine());
      }
      
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      long result = 0;
      int j = 0;
      
      for(int i=0; i < k; i++) {
         while(j < n && items[j].m <= bags[i]) {
            pq.offer(items[j++].v);
         }
         if(!pq.isEmpty()) {
            result += pq.poll();
         }
      }
      
      System.out.println(result);
   }


}