
import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int diff = 0;
        for(int i=0; i < n; i++) { // ver
            String st = sc.nextLine();

            for(int j=0; j < st.length()-1; j++) { // hor
                int[] temp = new int[m];
                 // save 0 and 1 in temp
                for(int k=-0; k < temp.length; k++) temp[k] = k%2;
                // System.out.println(Arrays.toString(temp));
                
                // current index
                if(i%2 == 0) {
                    if(st.charAt(j) == 'B' && temp[j] != 0) diff++;
                }
                if(i%2 != 0) {
                    if(st.charAt(j) == 'W' && temp[j] != 0) diff++;
                }
            }
        }
        System.out.println();
        System.out.println(diff);
    }
}