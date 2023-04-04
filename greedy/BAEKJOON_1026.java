import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BAEKJOON_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		
		for(int i=0; i < n; i++) a.add(sc.nextInt());
		for(int i=0; i < n; i++) b.add(sc.nextInt());
		ArrayList<Integer> c = (ArrayList<Integer>) b.clone();

        Collections.sort(a);
        Collections.sort(c);
        Collections.reverse(c);

        int s = 0;
        for(int i=0; i < n; i++) {
        	s += a.get(i) * c.get(i);
        }
		System.out.println(s);
	}
}