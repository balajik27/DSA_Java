package Day7;

public class Palindrome_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45540;
		int temp = num;
		System.out.println("temp " +temp);
		int rev = 0;
		while(temp > 0) {
			System.out.println("temp%10 " +temp%10);
			rev = (rev * 10) + temp%10;
			System.out.println("rev " + rev);
			temp/=10;
		}
		
		
		if(rev == num) System.out.println("palindrome");
		else System.out.println("Not palindrome");
	}

}
