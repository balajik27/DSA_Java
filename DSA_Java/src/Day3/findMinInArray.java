package Day3;

public class findMinInArray {

	public static void main(String[] args) {
		int[] arr = {4,3,7,5,9,6,1,8};
		int[][] arr2d = {
				{3,5,2,54,6,7,4},
				{67,6,24,4,56,7,78}
		};
		System.out.println(min(arr));
		System.out.println(min2d_arr(arr2d));
	}
	
	static int min(int[] arr) {
		
		if(arr.length!=0) {
			int min_ans = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(min_ans > arr[i]) {
					min_ans = arr[i];
				}
			}
			return min_ans;
		}
		return 0;
	}
	
	
	static int min2d_arr(int[][] arr) {
		
		if(arr.length!=0) {
			int min_ans = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(min_ans > arr[i][j]) {
						min_ans = arr[i][j];
					}
				}
			}
			return min_ans;
		}
		
		return 0;
	}
	
	
	
	
}
