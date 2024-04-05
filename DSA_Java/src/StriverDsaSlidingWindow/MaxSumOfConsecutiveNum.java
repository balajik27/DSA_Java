package StriverDsaSlidingWindow;

public class MaxSumOfConsecutiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {6,2,3,-1,-5,1,1};
		int k = 3;
		int left = 0;
		int right = 0;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		while(right<nums.length) {
			sum = sum + nums[right++];
			if(right-left == k) {
				maxSum = Math.max(maxSum , sum);
				sum = sum - nums[left++];
			}
		}
		
		System.out.println(maxSum);
	}
}
