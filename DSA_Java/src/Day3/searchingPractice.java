package Day3;

public class searchingPractice {

	public static void main(String[] args) {
		int[] arr = {4,23,5,6,5,564,534,5,4654,65,46,546,45};
		int target = 5;
		
		System.out.println(linearSearch(arr , target));
	}

	static int linearSearch(int[] arr , int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
