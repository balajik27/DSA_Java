package StriverDsaSlidingWindow;

public class LongestSubarrSumLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] { 7 , -2 , 2 , 5, 1 , 10};
		int k = 14;
		
		int left = 0;
		int right = 0;
		int sum = 0;
		int maxLen = 0;
		int maxSum = 0;

		int start = 0;
		int end = 0;
		
		while(right<nums.length) {
			sum = sum + nums[right++];
			
			if(sum>k) {
				sum = sum - nums[left++];
			}
			if(sum<=k) {
				if(maxLen < right - left) {
					maxLen = right - left;
					start = left ;
					end = right-1;
				}
				maxSum = Math.max(maxSum, sum);
			}
			
		}
		
		System.out.println(maxLen);
		System.out.println(maxSum);
		
		System.out.println(start + " , "+ end);
	}

}
