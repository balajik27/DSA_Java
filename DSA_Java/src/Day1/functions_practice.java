
package Day1;
import java.util.Scanner;


public class functions_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print(sum(4, 5));
		
		System.out.println("Enter Your Name : ");
		String name = s.next();
		
		String person = greet(name);
		System.out.println(person);

		
	}
	static String greet(String name) {
		String msg = "Hello " + name;
		return msg;
	}
	static int sum(int a, int b) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Number 1 : ");
		int num1 = s.nextInt();
		
		
		System.out.print("Enter the Number 2 : ");
		int num2 = s.nextInt();
		
		return num1 + num2;
		
	}
}
