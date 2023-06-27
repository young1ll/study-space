import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_2920 {
    // 음계

    // c, d, e, f, g, a, b, C
    // 1, 2, 3, 4, 5, 6, 7, 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[8];
        for(int i=0; i < 8; i++) {
            notes[i] = sc.nextInt();
        }
        int[] checkArr = new int[8];
        for(int i=0; i < notes.length-1; i++) {
            if(notes[i] > notes[i+1]) checkArr[i] = 0;
            else if(notes[i] < notes[i+1]) checkArr[i] = 1;

            if(i == 6 && notes[i] > notes[i+1]) checkArr[i+1] = 0;
            else if(i == 6 && notes[i] < notes[i+1]) checkArr[i+1] = 1;
        }
        String result = "";
        for(int i=0; i < checkArr.length-1; i++) {
            if( checkArr[i] == checkArr[i+1] && checkArr[i] == 1 ) result = "ascending";
            else if( checkArr[i] == checkArr[i+1] && checkArr[i] == 0 ) result = "descending";
            else if( checkArr[i] != checkArr[i+1] ) {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
