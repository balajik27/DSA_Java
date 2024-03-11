package Day4;

import java.util.Arrays;

public class ownArrayProblem {

	public static void main(String[] args) {
		int[] arr1 = {34,65,23,4,6,67,4,23,1,56};
		int[] arr2 = {4,56,2,4,6788,3,2,57,9};
		
		
			
		System.out.println(Arrays.toString(findMinValues(arr1 , arr2)));
	}
	
	static int[] findMinValues(int[] arr1 , int[] arr2) {

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for(int i=0;i<Math.max(arr1.length , arr2.length); i++) {
			if(i < arr1.length) {
				min1 = Math.min(min1 , arr1[i]);
			}
			if(i<arr2.length) {
				min2 = Math.min(min2 , arr2[i]);
			}
		}
		
		return new int[] {min1 , min2};
	}

}
