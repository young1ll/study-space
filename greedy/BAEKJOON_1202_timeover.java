import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class BAEKJOON_1202_timeover {
   public static void main(String[] args) throws IOException {
      // N개의 보석
      // 각 보석 무게 Mi
      // 각 보석 가격 Vi
      // 가방 K개
      // 최대 무게 Ci
      // 최대 한 개

      // N 과 K
      // Mi Vi : N번
      // Ci

      // 훔칠 수 있는 보석 가격의 합의 최댓값

      // 풀이 1
      // 결과를 출력할 int 선언
      // 1. n과 k 입력 받기
      // 2. n번 반복문 : Mi 와 vi 입력 받기
      // 3. a 무게와 값을 가진 리스트 또는 맵에 저장
      // 4. K 입력 받기
      // 5. b 리스트에 저장
      // 6. a와 b를 비교하고 조건 부합하면 a 가격을 result에 더하고 삭제(해당 b 값도 삭제)
      // + a와 b를 비교하기 전, 인덱싱이 쉽도록 정렬
      // 7. 비교할 값이 없다면(특히 b) 결과 출력

      // 키(무게)로 값(가격)을 반환하는 HashMap

      // 실패 | 시간초과 : n과 k의 크기에 대해 각각 정렬이 이루어지기 때무에 큰 영향을 받는다.
      //                  Collections.sort, map -> EntrySet sort
      //===========================================================
      
      // 풀이 2
      // (기본 정수형 오름차 순 정렬을 제공하는 Heap : PriorityQueue를 이용해 풀 수도 있다고 한다.)
      // 풀이 1에서 map만 정렬하고 list는 pointer를 이용해 최적값을 선별한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      List<Integer> list = new ArrayList<>();
      int result = 0;


      for(int i=0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         int m = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
         map.put(m, v);

      }
      for(int i=0; i < k; i++) {
         list.add(Integer.parseInt(br.readLine()));
      }

      // 오름차 정렬
      list.sort(Comparator.naturalOrder());

      // Map Max, Min search : https://hianna.tistory.com/577
      // map -> enSet
      Set<Entry<Integer, Integer>> enSet = map.entrySet();
      // search Max Key in enSet : 반복해서 찾아야 함...
      for(int i=0; i < list.size(); i++) {
         Entry<Integer, Integer> max_ent = null;
         
         for(java.util.Map.Entry<Integer, Integer> ent : enSet) {
            max_ent = (max_ent == null) || (ent.getValue() > max_ent.getValue()) ? ent : max_ent;
         }
         
         if(max_ent.getKey() <= list.get(i)) {
            result += max_ent.getValue();
            enSet.remove(max_ent);
         }
      }

      
      // 핵심은 최소리스트 vs 최소 키 중 최대 값
      System.out.println(result);
   }
}
