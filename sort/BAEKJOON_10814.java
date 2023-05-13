import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAEKJOON_10814 {
    public static void main(String[] args) throws IOException {
        // 나이 이름 입력 받고 정렬하는 문제
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Map.Entry<Integer, String>> al = new ArrayList<>();

        for(int i=0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            Map.Entry<Integer, String> map = new AbstractMap.SimpleEntry<>(a, b);

            al.add(map);
        }

        al.sort(Comparator.comparingInt(Map.Entry::getKey));

        for(Map.Entry<Integer, String> map : al) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
