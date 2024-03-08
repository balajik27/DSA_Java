package Day2_array;
import java.util.*;

public class array_2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[3][2];
		
		int[][] arr2 = {
				{3,6,2,7},
				{4,6},
				{2,1,1}
		};
		
		
		//input 
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("This is Arr1");
		//output
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("This is Arr2");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("This is Arr2 used toString()");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));

		}
		
		System.out.println("This is Arr2 used Enhanced for loop and toString()");

		for(int[] i : arr2) {
			System.out.println(Arrays.toString(i));
		}
		
	}

}
