import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BAEKJOON_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stArr1[] = br.readLine().split(" ");
		String stArr2[] = br.readLine().split(" ");
		
		int numArr1[] = new int[2];
		int numArr2[] = new int[stArr2.length];
		for(int i=0; i<stArr1.length; i++) numArr1[i] = Integer.parseInt(stArr1[i]);
		for(int i=0; i<stArr2.length; i++) numArr2[i] = Integer.parseInt(stArr2[i]);

		List<Integer>result = new ArrayList<>();
		for(int i=0; i < stArr2.length; i++) {
			if(numArr2[i] < numArr1[1]) result.add(numArr2[i]);
		}
		for(int r : result) System.out.print(r + " ");
	}
}
