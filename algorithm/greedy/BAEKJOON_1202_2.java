import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BAEKJOON_1202_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Map.Entry<Integer, Integer>> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            items.add(new AbstractMap.SimpleEntry<>(weight, value));
        }
        items.sort(Comparator.comparingInt(Map.Entry::getKey));

        int[] bags = new int[k];
        for (int i = 0; i < k; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed());
                //(::) ...s -> ...s.getValue().reversed() 
        long result = 0;
        int itemIndex = 0;
        for (int bag : bags) {
            while (itemIndex < n && items.get(itemIndex).getKey() <= bag) {
                pq.offer(items.get(itemIndex++));
            }
            if (!pq.isEmpty()) {
                result += pq.poll().getValue();
            }
        }
        System.out.println(result);
    }
}
// 반례
// 3 3
// 20 12
// 0 20
// 16 16
// 17
// 14
// 7

// [x] 20
// [o] 36