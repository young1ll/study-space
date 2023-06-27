//https://nanarin.tistory.com/115
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BAEKJOON_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] sort = new int[N];
		int[] cnt = new int[8001];//-4000 ~ 4000
		double arSum = 0;
		
		for(int i=0; i<N; i++) {
			sort[i] = Integer.parseInt(br.readLine());
			arSum += sort[i];
			cnt[sort[i]+4000]++;
		}
		
		int mode = 0;
		int max = 0, maxCnt = 0;//사용 횟수
		boolean isRep = false;//mode 중복 여부
		for(int i=0; i<=8000; i++) {
			if(cnt[i] > maxCnt) {
				maxCnt = cnt[i];
				mode = i-4000;
				isRep = false;
			}
			else if(cnt[i] == maxCnt && !isRep) {
				mode = i-4000;
				isRep = true;
			}
		}
		
//		for(int i=0; i<N; i++) { //bubble: O(N^2)|입력 값의 범위가 클 경우 부적절
//			for(int j=N-1; j>0; j--) {
//				if(sort[j-1] > sort[j]) {
//					int tmp = sort[j];
//					sort[j] = sort[j-1];
//					sort[j-1] = tmp;
//				}
//			}			
//		}
		
		Arrays.sort(sort); //간단히 해결
		
		int median = sort[N/2];
		int range = sort[N-1] - sort[0];
		
		bw.write(String.valueOf((int) Math.round(arSum/N))+'\n');
		bw.write(String.valueOf(median)+'\n');
		bw.write(String.valueOf(mode)+'\n');
		bw.write(String.valueOf(range)+'\n');
		bw.flush(); bw.close();
	}
}
