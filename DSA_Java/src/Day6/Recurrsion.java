package Day6;

public class Recurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNames(1,5);
	}
	
	static void printNames(int i , int num) {
		if(i<=num) {
			System.out.println("Balaji");
			printNames(i+1 , num);
		}
		return ;
	}

}
