package StriverDsaSlidingWindow;

public class LongestSubstrWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
		System.out.println(minRemoveToMakeValid("a)b(c)d"));
	}
	static String minRemoveToMakeValid(String s) {
        String lstr = "";
        String rstr = "";
        int left= 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(right) == '('){
                continue;
            }
            if(s.charAt(right) == ')'){
                while(s.charAt(left) != '(' && left<right){
                    if(s.charAt(left) != ')'){
//                        continue;
                        lstr = lstr + s.charAt(left++);
                    }
                }
                if(s.charAt(left) != ')') {                	
                	System.out.println("s.charAt(left++) = " +s.charAt(left));
                	lstr = lstr + s.charAt(left++);
                }
                System.out.println("lstr = " +lstr);
            }
            rstr = s.charAt(right--) + rstr;
            System.out.println(lstr + rstr);
        }
        return lstr + rstr;
    }

}
