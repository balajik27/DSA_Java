package Day3;

import java.util.Arrays;

public class searchingPractice {

	public static void main(String[] args) {
		int[] arr = {4,23,5,6,5,564,534,5,4654,65,46,546,45};
		int target = 5;
		
//		System.out.println(linearSearch(arr , target));
		
		String str = "Balaji";
		char char_target = 'j';
//		System.out.println(linearSearch_char(str , char_target));
//		System.out.println(linearSearch_char_boolean(str , char_target));
		
		int[][] arr2d = {
				{4,6,3,2,5,8},
				{-5,2,-4,8,9}
		};
		
		int target2d = -4;
		
//		System.out.println(Arrays.toString(search_in_2d_arr(arr2d , target2d)));
		
		
		int num = 224;
		
		System.out.println(Math.log10(num));
		
	}

	static int linearSearch(int[] arr , int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	
	static int linearSearch_char(String str , char target) {
		
		for (int i = 0; i < str.length(); i++) { // more efficient in terms of memory usage, especially for large strings,
			if(str.charAt(i) == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	static boolean linearSearch_char_boolean(String str , char target) {
		if(str.length()==0) {
			return false;
		}
		for (char ch : str.toCharArray()) { // unnecessary array creation. 
			if(ch == target) {
				return true;
			}
		}
		return false;
	}
	
	
	static int[] search_in_2d_arr(int[][] arr_2d ,int target) {
		
		if(arr_2d.length != 0) {
			for (int i = 0; i < arr_2d.length; i++) {
				for (int j = 0; j < arr_2d[i].length; j++) {
					if(arr_2d[i][j] == target) {
						return new int[] {i , j};
					}
				}
			}
		}
		
		return new int[]{-1 , -1};
	}
	
	
	
}
