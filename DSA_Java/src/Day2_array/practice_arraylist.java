package Day2_array;
import java.util.*;

public class practice_arraylist {

	public static void main(String[] args) {
		
//		print 1-5 using normal array
		System.out.println("print 1-5 using normal array");
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
		
		for(int i=1;i<=arr.length;i++) {
			arr[i-1] = i;
		}
		System.out.println(Arrays.toString(arr));
		
		
//		print 1-5 using arraylist
		System.out.println("print 1-5 using arraylist");
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
//		print 1-5 3 rows using 2d array in normal
		System.out.println("print 1-5 3 rows using 2d array in normal");
		int[][] arr2d = new int[3][5];
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				arr2d[i][j] = j+1;
			}
		}
		
		
//		if row size only mentioned and column not mentioned
		int[][] arr2dd = new int[3][];
//		arr2d[0] = new int[] {3,4,5,6,7,5};
//		arr2d[1] = new int[] {4,2,6,7,8};
//		arr2d[2] = new int[] {3,1};
				
//		int[][] arr2dd = new int[3][]; //declaration
//		arr2dd = new int[][]{ // initialization
//				{2,3,4,5},
//				{2,4},
//				{1,6}
//		};
		
//		int[] arr3;
//		arr3 = new int[]{3,4,56};
		
		for(int i=0;i<arr2d.length;i++) {
			System.out.println(Arrays.toString(arr2d[i]));
		}
		
		ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			list2d.add(new ArrayList<>());
		}
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list2d.get(i).add(1);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list2d.get(i).set(1,4);
			}
		}
		
//		for(int i=0;i<3;i++)[]
		System.out.println(list2d);
			

	}

}
