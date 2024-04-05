package StriverDsaSlidingWindow;

public class MaxPointsFromCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,4,5,6,4,3,2,1};
		int k = 4;
		int lSum = 0;
		int rSum = 0;
		int maxSum = 0;
		
		for(int i=0;i<k;i++) {
			lSum += nums[i];
		}
		maxSum = lSum;
		System.out.println("lSum = "+lSum);
		for(int i = k-1 , right = nums.length -1;i>=0;i--, right--) {
			System.out.println("nums[i] = " + nums[i]);
			System.out.println("nums[right--] = " + nums[right]);
			lSum = lSum - nums[i];
			rSum = rSum + nums[right];
			
			System.out.println("lSum = " + lSum);
			System.out.println("rSum = " + rSum);
			
			
			
			
			System.out.println("lSum + rSum = " + (lSum + rSum));
			maxSum = Math.max(maxSum , lSum + rSum);
		}
		
//		maxSum = Math.max(maxSum, lSum);
		
		System.out.println(maxSum);
	}

}
