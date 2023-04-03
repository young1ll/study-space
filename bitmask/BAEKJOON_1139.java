// 미해결 : dynamic_programming/BAEKJOON_1139
import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_1139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int[] nums = new int[n];
		for(int i=0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println(calcMaxArea(nums));
    }//main
    
	public static double calcMaxArea(int[] nums) {
	    Arrays.sort(nums);
	    double[] areas = new double[1 << nums.length];
	    int[] cnts = new int[1 << nums.length];
	    for (int mask = 0; mask < (1 << nums.length); mask++) {
	        int cnt = 0;
	        double maxArea = 0.0;
	        for (int i = 0; i < nums.length; i++) {
	            if ((mask & (1 << i)) != 0) {
	                cnt++;
	                for (int j = i + 1; j < nums.length; j++) {
	                    if ((mask & (1 << j)) != 0) {
	                        for (int k = j + 1; k < nums.length; k++) {
	                            if ((mask & (1 << k)) != 0) {
	                                int max = Math.max(Math.max(nums[i], nums[j]), nums[k]);
	                                if (max < ((nums[i] + nums[j] + nums[k]) - max)) {
	                                    double s = (nums[i] + nums[j] + nums[k]) / 2.0;
	                                    double area = Math.sqrt(s * (s - nums[i]) * (s - nums[j]) * (s - nums[k]));
	                                    maxArea = Math.max(maxArea, area);
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        areas[mask] = maxArea;
	        cnts[mask] = cnt;
	    }

	    double[] dp = new double[1 << nums.length];
	    dp[0] = 0.0;
	    for (int mask = 1; mask < (1 << nums.length); mask++) {
	        for (int subMask = mask; subMask > 0; subMask = (subMask - 1) & mask) {
	            if (cnts[subMask] >= 3) {
	                dp[mask] = Math.max(dp[mask], dp[mask ^ subMask] + areas[subMask]);
	            }
	        }
	    }
	    return dp[(1 << nums.length) - 1];
	}
}
