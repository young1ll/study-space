import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_1139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int[] nums = new int[n];
		for(int i=0; i < n; i++) nums[i] = sc.nextInt();
        
//		int[] nums = {2, 2, 3, 3, 4, 4, 5};
        calcMaxArea(nums);
    }
    
	//Helper: Generate bitMask
    public static void calcMaxArea(int nums[]) {
    	Arrays.sort(nums);
        int mask = 0;
        for(int i=0; i < nums.length; i++) {// save
            if((mask & (1 << nums[i])) == 0) mask |= (1 << nums[i]);
        }
        long bitMask = Integer.toUnsignedLong(mask);
        
//      for(int i=0; i < nums.length; i++) {// print
//      if((bitMask & (1 << nums[i])) != 0) {
//      	System.out.print(nums[i] +" ");
//      }
//  } System.out.println();

        calcMaxArea(nums, bitMask, 0);
    }
    
    public static void calcMaxArea(int[] nums, long bitMask, double maxSum) {
    	System.out.println("=".repeat(10));
    	int cnt = 0;
    	for(int i=0; i < nums.length; i++) {
    		if((bitMask & (1 << nums[i])) != 0) {
    			cnt++;
    		}
    	}
    	if(cnt < 3) {
    		System.out.println(maxSum);
    		return;
    	}
    	
    	//a, b, c : nums 배열 수정
        double maxArea = 0.0; int a = -1, b = -1, c = -1;
        for(int i=0; i < nums.length; i++) {
        	for(int j=i+1; j < nums.length; j++) {
        		for(int k=j+1; k < nums.length; k++) {
        			
        			if(((1 << nums[i]) & bitMask) != 0 &&
        			   ((1 << nums[j]) & bitMask) != 0 &&
        			   ((1 << nums[k]) & bitMask) != 0) {
        				int max = Math.max(Math.max(nums[i], nums[j]), nums[k]);
        				System.out.print(nums[i] +" "+ nums[j] +" "+ nums[k] +" | ");
        				//if(max < ((nums[i]+nums[j]+nums[k])-max)) {
        					double s = (nums[i]+nums[j]+nums[k])/2.0;
        					double area = Math.sqrt(s*(s-nums[i])*(s-nums[j])*(s-nums[k]));
        					System.out.println(area);
        					if(maxArea < area && !Double.isNaN(area)) {
        						a = i; b = j; c = k;
        						maxArea = area;
        				//	}        					
        				}
        			}
        		}
        	}
        }// for i
        maxSum += maxArea;
        
        if((a != -1) || (b != -1) || (c != -1)) nums[a]=nums[b]=nums[c]=0;
        if((a == -1) || (b == -1) || (c == -1)) {
        	System.out.println(maxSum);
        	return;
        }
        
        calcMaxArea(nums, bitMask, maxSum);
    }
}
