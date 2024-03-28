package Day8;

public class Maximum_sum_of_all_subarrays {

	private static final int MIN_VALUE = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {100, 200 , 300 , 400};
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 ;
		int arr2[] = {1, 4}, k2 = 4 ;
		Maximum_sum_of_all_subarrays max_ans = new Maximum_sum_of_all_subarrays();
		max_ans.max_Subarray(nums);
		max_ans.max_subarray_k(arr , k);
//		max_ans.max_subarray_k(arr2 , k2);
	}
	
	void max_subarray_k(int[] nums , int k) {
		if(nums.length < k) {
			System.out.println(-1);
			return;
		}
		int max = MIN_VALUE;
		for(int i=0;i < nums.length - k + 1;i++) {
			int current_sum = 0;
			for(int j = 0;j<k;j++) {
				current_sum = current_sum + nums[i + j];
			}
			max = Math.max(current_sum , max);
		}
		
		System.out.println(max);
	}
	
	void max_Subarray(int[] nums) {
		int current = 0;
		int next = 1;
		
		if(nums.length == 1) {
			System.out.println(nums[0]);
		}
		int max = MIN_VALUE;
		for(int i=0;i<nums.length-1;i++) {
			int sum = nums[current] + nums[next];
			max = Math.max(sum, max);
			current++;
			next++;
		}
		System.out.println(max);
	}

}
