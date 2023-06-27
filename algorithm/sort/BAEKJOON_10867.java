import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BAEKJOON_10867 {
    // 중복빼고 정렬하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeSet<Integer> tSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            tSet.add(val);
        }

        Iterator<Integer> iter = tSet.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() +" ");
        }
    }
}
