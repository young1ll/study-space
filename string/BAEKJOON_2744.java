import java.util.Scanner;

public class BAEKJOON_2744 {
    // 대소문자 바꾸기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        String newSt = "";
        for(int i=0; i < st.length(); i++) {
            char ch = st.charAt(i);
            ch = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            newSt += ch;
        }
        System.out.println(newSt);
    }
}
