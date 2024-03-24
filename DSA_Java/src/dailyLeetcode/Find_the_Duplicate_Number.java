package dailyLeetcode;

public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,4,2,2};
		int ans = findDuplicate(nums);
		System.out.println("ans = " + ans);
	}
	public static int findDuplicate(int[] nums) {
		
		boolean[] status = new boolean[nums.length];
		
		for(int num :nums) {
			if(status[num]) {
				return num;
			}
			status[num] = true;
		}
		
		return -1;
		
	}
}
