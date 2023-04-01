//package baekjoon;

import java.io.*;

public class BAEKJOON_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] counting = new int[10001];
		int[] result = new int[n];
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) counting[a[i]]++;
		for(int i=1; i<counting.length; i++) counting[i] += counting[i-1];
		for(int i = n-1; i>=0; i--) {//뒤에서부터
			int v = a[i];
			counting[v]--;
			result[counting[v]] = v;
		}
		
		for(int i=0; i<result.length; i++) {
			bw.write(String.valueOf(result[i]) +"\n");
		}
		bw.flush();
		
	}
}
