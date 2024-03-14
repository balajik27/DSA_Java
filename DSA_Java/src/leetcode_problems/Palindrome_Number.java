package leetcode_problems;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		boolean ans = s.isPalindrome(1);
		System.out.println(ans);
	}

}
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int digit = (int)Math.log10(x) +1;
        System.out.println(digit);
        return true;
        
    }
}