package dailyLeetcode;

import java.util.*;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = {3,3,2,3,2,1,3};
		int nums[] = {1 , 3, 3 ,1 , 3 , 1};
//		int nums[] = {1 , 3 , 2 ,3 ,3};
//		int nums[] = {1,4,2,1};
		Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times obj = new Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times();
		obj.Count_Solution(nums , 2);
		obj.Count_Solution_Optimal(nums , 2);
	}

	void Count_Solution_Optimal(int[] nums , int k) {
		int length = nums.length;
		int max = 0;
		
		for(int num : nums)
			max = Math.max(max, num);
		
		int count = 0 , res = 0 , l = 0;
		for(int r = 0;r<length;r++) {
			if(nums[r] == max) {
				count++;
			}
			while(count>=k) {
				res = res + length - r;
				if(nums[l] == max)
					count--;
				l++;
			}
		}
	}
	
	void Count_Solution(int[] nums , int k) {
//		My solution
		int length = nums.length;
		int max = 0;
		int max_count = 0;
		for(int i=0;i<length;i++) {
			if(nums[i] == max) {
				max_count++;
			} else if(nums[i] > max) {
				max = nums[i];
				max_count = 1;
			}
		}
		
		if(max_count < k) {
			System.out.println(0);
		}
		
		int left = 0;
		int max_count_arr = 0;
		int output = 0;
		
		for(int right =0;right<length;right++) {
			if(nums[right] == max) {
				max_count_arr++;
			}
			if(max_count_arr>=k) {
				int temp_max_count_arr = max_count_arr;
				for(int temp_left = 0; temp_max_count_arr >= k; temp_left++) {
						output++;
					if(nums[temp_left] == max) {
						temp_max_count_arr--;
					}
				}
			}
		}
		System.out.println("output = " + output);
	} 
}
