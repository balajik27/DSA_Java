package dailyLeetcode;

public class Subarray_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10 , 5 , 2 , 6};
		Subarray_less_than_k ans = new Subarray_less_than_k();
		ans.Subarray_solution(nums , 100);
		ans.Subarray_solution_optimal(nums , 100);
	}
	
	void Subarray_solution_optimal(int nums[] , int k) {
		//sliding window
		int prod = 1;
		int left = 0;
		int count = 0;
		for(int right =0;right<nums.length; right++) {
			prod = prod * nums[right];
			
			while(prod>=k) {
				prod = prod / nums[left];
				left++;
			}
			count = count + right - left + 1;
		}
		System.out.println(count);
	}
	
	void Subarray_solution(int[] nums , int k) {
		
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			int prod = 1;
			
			for(int j=0;i+j<nums.length;j++) {
				prod = prod * nums[i+j];
				if(prod < k) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
