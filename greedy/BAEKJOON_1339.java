
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BAEKJOON_1339 {
    // :: hint ::
    // 각 알파벳을 미지수로 두고 생각해본다면,
    // GCF + ACDEB 는
    // GCF => G*(100) + C*(10) + F*(1),
    // ACDEB => A*(10000) + C*(1000) + D*(100) + E(10) + B*(1) 이 된다.
    // 위를 내림차 순으로 정리하면,
    // A*(10000) + C*(1000 + 10) + G*(100) + D*(100) + E(10) + B*(1) + F*(1) 가 된다.

    // 위 과정을 코드로 구현하면,
    // 1. 문자열을 입력 받고 배열에 저장
    // 2. 저장된 배열 내 문자열의 알파벳 마다 자릿 수 구하기
    // 3. 높은 문자열에 높은 수를 대입하고 자릿수와 곱하기
    // 4. 모두 더하기
    // ============================================================
    // 1. n 입력 받기
    // 2. 문자열 char로 입력 받기, 자릿수도 필요하기 때문에 Map으로..
    // 3. 저장할 때 키 체크 : 중복 시 값을 더하기
    // 4. 값 기준으로 Map 정렬 내림차
    // 5. 같은 키 값을 가졋다면 자릿수 더하기
    // + Entry 이해하기!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for(int i=0; i < n; i++) {
            String s = sc.next();
            int digit = 0;
            for(int j=s.length()-1; j >=0; j--) {
                int num = (int) Math.pow(10, digit);

                if(map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + num);
                }
                else map.put(s.charAt(j), num);
                digit++;
            }
        }

        // sort : Map to List
        List<Map.Entry<Character, Integer>> enList = new ArrayList<>(map.entrySet());
        enList.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int num = 9;
        for(Map.Entry<Character, Integer> m : enList) {
            result += m.getValue() * num;
            num--;
        }

        System.out.println(result);
    }
}
