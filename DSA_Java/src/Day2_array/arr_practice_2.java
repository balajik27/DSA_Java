package Day2_array;

import java.util.Arrays;

public class arr_practice_2 {

	public static void main(String[] args) {
		int[] arr = {2,3,5,874,3};
		
		int a=10;
		int b=20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		swap(a,b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println(Arrays.toString(arr));
		
		change(arr);
		
		System.out.println(Arrays.toString(arr));

		

	}
	static void change(int[] nums) {
		nums[3] = 1;
	}
	static void swap(int num1 , int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
	}

}
