import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[sc.nextInt()];
		for(int i=0; i < nums.length; i++) nums[i] = sc.nextInt();
		int[] mums = new int[sc.nextInt()];
		for(int i=0; i < mums.length; i++) mums[i] = sc.nextInt();
		
		//TimeOut
//		for(int i=0; i < mums.length; i++) {
//			for(int j=0; j < nums.length; j++) {
//				if(mums[i] == nums[j]) {
//					System.out.print(1); break;
//				}
//				else if(j == nums.length-1) System.out.print("0");
//			}
//			System.out.print(" ");
//		}
		Arrays.sort(nums);
		for(int i=0; i < mums.length; i++) {
			bSearch(nums, mums[i]);			
		}
	}
	
	public static int bSearch(int[] nums, int tar) {
		int start = 0, end = nums.length-1, mid = (end+start)/2;
		while(end-start >= 0) {
			if(nums[mid] == tar) {
				System.out.print(1+" ");
				return mid;
			} else if(nums[mid] <= tar) {
				start = mid+1;
			} else {
				end = mid-1;
			}
			mid = (end+start)/2;
		}			
		System.out.print(0+" ");
		return -1;
	}
}