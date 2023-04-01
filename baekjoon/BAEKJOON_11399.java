//package baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BAEKJOON_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int time = 0;
        int result = 0;

        for(int i=0; i < n; i++) arr.add(sc.nextInt());
        Collections.sort(arr);

        for(int i=0; i < arr.size(); i++) {
            time += arr.get(i);
            result += time;
        }
        System.out.println(result);
        sc.close();
    }
}