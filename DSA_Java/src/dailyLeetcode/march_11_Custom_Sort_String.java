package dailyLeetcode;

public class march_11_Custom_Sort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		String ans = s.customSortString("cba", "abcd");
		System.out.println(ans);
	}

}
protected class Solution {
    public String customSortString(String order, String s) {
        int order_length = order.length();
        int currentSwap = 0;

        char[] orders = order.toCharArray();
        char[] s_array = s.toCharArray();

        for(int i=0;i<order_length;i++){
            if(currentSwap != s_array.length){
                for(int j = currentSwap; j < s_array.length; j++){
                    if(orders[i] == s_array[j] && currentSwap == j){
                        currentSwap++;
                    } else if (orders[i] == s_array[j] && currentSwap != j){
                        char temp = s_array[j];
                        s_array[j] = s_array[currentSwap];
                        s_array[currentSwap] = temp;
                        currentSwap++;
                    }
                }
            } else {
                break;
            }
        }
        return new String(s_array);
    }
}

