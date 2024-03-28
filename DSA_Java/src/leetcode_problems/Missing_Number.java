package leetcode_problems;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};
		Missing_Number ans = new Missing_Number();
		ans.missing_no_solution(nums);
		ans.missing_no_second(nums);
	}
	void missing_no_solution(int[] nums) {
		
		//optimal
		
		long expected_sum = (nums.length) * (nums.length + 1) / 2;
		for(int i = 0;i<nums.length;i++) {
			expected_sum -= nums[i];
		}
		System.out.println(expected_sum);
		
	}
	
	void missing_no_second(int[] nums) {
		int length = nums.length , i = 0;
		
		for(i=0;i<length;i++) {
			while(nums[i] < length && nums[i] != nums[nums[i]]) {
				swap(nums, i , nums[i]);
			}
		}
		
		for(i=0;i<length;i++) {
			if(nums[i] != i) {
				System.out.println(i);
				break;
			}
		}
	}
	void swap(int[] nums ,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
