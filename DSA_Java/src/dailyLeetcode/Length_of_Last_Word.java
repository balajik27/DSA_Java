package dailyLeetcode;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		Length_of_Last_Word ans = new Length_of_Last_Word();
		System.out.println(ans.findLength(s));
		
	}
	
	 int findLength(String s) {
		int count = 0;
		
		for(int i = s.length() -1;i>=0;i--) {
			if(s.charAt(i)!=' ') count++;
			else if(count != 0) break;
		}
		return count;
	}

}
