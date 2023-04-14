import java.io.*;
import java.util.*;

public class BAEKJOON_1202_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map.put(m, v);
        }

        int[] bags = new int[k];
        for (int i = 0; i < k; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);

        long result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0, j = 0; i < k; i++) {
            while (j < n && map.containsKey(map.keySet().toArray()[j]) && (int) map.keySet().toArray()[j] <= bags[i]) {
                pq.offer(map.get(map.keySet().toArray()[j++]));
            }
            if (!pq.isEmpty()) {
                result += pq.poll();
            }
        }

        System.out.println(result);
    }
}