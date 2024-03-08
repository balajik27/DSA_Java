package Day2_array;

import java.util.*;

public class array_practice {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[5]; // if no size mentioned then error
		int[] arr2 = {4,5,6,7,8}; // all the type of the array should be same  , here only int

		int[] arr3; // declaration of array ,  arr3 is getting defined in the stack , arr3 should be point to the obj
		arr3 = new int[5]; // initialization , 
		
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = sc.nextInt();
//		}
//		for (int i : arr3) {
//			System.out.println(i + " ");			
//		}
//		for (int j = 0; j < arr3.length; j++) {
//			System.out.println(arr3[j] + " ");			
//		}
//		
//		System.out.println(Arrays.toString(arr3));
		
		
		String[] str = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		System.out.println(Arrays.toString(str));
	}

}
