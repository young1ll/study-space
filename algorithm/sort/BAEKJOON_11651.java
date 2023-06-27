import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON_11651 {
    // 좌표 정렬하기 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (o1, o2) -> o1.getValue().compareTo(o2.getValue()) == 0 ?
                        o1.getKey().compareTo(o2.getKey()) :
                        o1.getValue().compareTo(o2.getValue())
        );
        
        for(int i=0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            
            Map.Entry<Integer, Integer> map = new AbstractMap.SimpleEntry<>(a, b);
            pq.add(map);
        }

        while(!pq.isEmpty()) {
            Map.Entry<Integer, Integer> map = pq.poll();
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
