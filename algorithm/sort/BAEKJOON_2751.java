package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BAEKJOON_2751 {
	static int[] buff; //작업용 배열
	
	private static void mergeSort(int[] a) {
		buff = new int[a.length];
		mergeSort(a, 0, a.length-1);
		buff = null;
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			mergeSort(a, left, center); //좌측부
			mergeSort(a, center+1, right); //우측부
			
			for(i = left; i<=center; i++) {
				buff[p++] = a[i]; //buff에 배열 복사
				//System.out.println(a[i]);
			}
			while(i <= right && j < p) {
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
			}
			while(j < p) a[k++] = buff[j++];
		}
	}

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		if(n<0 && n>1000000) return;
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if(nums[i] > 1000000) return;
		}
		
		mergeSort(nums);
		for(int i=0; i<n; i++) bw.write(nums[i]+"\n");
		bw.close();
	}
}
