
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    // 1. n 입력 받기
    // 2. 문자열 배열로 입력 받기
    // 3. 문자열 자릿수가 높은 문자열을 자릿수와 문자를 가진 맵으로 저장
    // 4. 같은 키 값을 가졋다면 자릿수 더하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Map<Character, Integer>> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        
        int result = 0;
        
        for(int i=0; i < n; i++) {
            String str = sc.next();
            int digit = 0;
            for(int j=str.length()-1; j >= 0; j--) {
                map.put( str.charAt(j), (int) Math.pow(10, digit) );
                for(Map<Character, Integer> c : list) {
                    
                }
                
                digit++;

                list.add(map);
            }
        }
        
        // // sort
        // Collections.sort(list, new Comparator<Map<Character, Integer>>() {
        //     @Override
        //     public int compare(Map<Character, Integer> o1, Map<Character, Integer> o2) {
        //         Integer v1 = o1.values().iterator().next();
        //         Integer v2 = o2.values().iterator().next();

        //         if(v2.compareTo(v1) == 0) {
        //             Character k1 = o1.keySet().iterator().next();
        //             Character k2 = o2.keySet().iterator().next();
        //             return k1.compareTo(k2);
        //         }
        //         return v2.compareTo(v1);
        //     }
        // });


        // for(Map<Character, Integer> m : list) {
        //     int num = 9;
        //     for(Map.Entry<Character, Integer> en : m.entrySet()) {
        //        if( en.getKey() == list.get(n) )
        //     }
        // }

        // System.out.println(Arrays.toString(str));
        System.out.println(list);
        System.out.println(result);


    }

}
