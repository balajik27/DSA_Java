package leetcode_problems;
//136. Single Number
import java.util.*;
public class Give_non_duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,1,2,2};
		int ans = singleNumber_mysolution(nums);
		ans = singleNumber_optimal(nums);
		System.out.println("ans = " + ans);
	}
	public static int singleNumber_optimal(int[] nums) {
		 int result = 0;
//		 The XOR ( ^ ) is an logical operator that will return 1 when the bits are different and 0 elsewhere.
		 for (int num : nums) {
            result ^= num;
         }
		
		 return result;
	}
	public static int singleNumber_mysolution(int[] nums) {
		Map<Integer , Integer> hash = new HashMap<>();
		
		for(int num:nums) {
			if(hash.containsKey(num)) {
				hash.put(num, hash.get(num)+1);
			} else {
				hash.put(num , 0);
			}
		}
		for(int num :nums) {
			if(hash.get(num)==0) {
				return num;
			}
		}
		return -1;
	}
}
