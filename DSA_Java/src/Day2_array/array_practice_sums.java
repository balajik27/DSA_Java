package Day2_array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class array_practice_sums {

	public static void main(String[] args) {
		
//		evennumbers();
//		evennumbers2d();
//		largestnumber();
//		largestnumber_in_collections();
//		copyArray();
//		arraysEqual_predefined();
		matrix_no_predefined();
		
	}
	
	static void evennumbers() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter the size of the array: ");
		int size = in.nextInt();
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+ (i + 1) + " number: ");
			arr[i] = in.nextInt(); 
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i] + " is even number");
			}
		}
		in.close();
	}
	
	
	static void evennumbers2d() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter the size of the row: ");
		int row = in.nextInt();

		System.out.println("Enter the size of the column: ");
		int column = in.nextInt();
		
		int[][] arr = new int[row][column];
		
		for (int r = 0; r < arr.length; r++) {
			for(int col = 0;col<arr[r].length;col++) {
				System.out.println("Enter the "+ r + col + " number: ");
				arr[r][col] = in.nextInt(); 
			}
		}
		
//		for (int r = 0; r < arr.length; r++) {
//			System.out.println(Arrays.toString(arr[r]));
//		}
//		for(int[] r : arr) {
//			System.out.println(Arrays.toString(r));
//		}
		
		System.out.println(Arrays.deepToString(arr));
		in.close();
	}
	
	
	static void largestnumber() {
		Scanner in = new Scanner(System.in);	
		try {
			
			System.out.println("Enter the size of the array: ");
			int size = in.nextInt();
			
			if(size<=0) {
				System.out.println("Array size is negative or zero");
				return;
			}
			
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				if (in.hasNextInt()) { // if the input is integer then it return true , otherwise it is false(wefrwefewfretre or 32453543654657657)
				    arr[i] = in.nextInt();
				} else {
				    System.out.println("Error: Insufficient input provided.");
				    return;
				}
				
			}
			
			int max = Integer.MIN_VALUE;
			
			for(int num : arr) {
				max = (num > max)? num : max; // this is also good , but looks complex.
				max = Math.max(num ,  max); // cleaner and more concise way , improves readability and maintainability
			}
			System.out.println("Max value is "+max);
		}
		catch(Exception e) {
			System.out.println("Error message " + e);
			//if i enter characters then --> Error message java.util.InputMismatchException
		}
		finally {			
			in.close();
		}
	}

	
	static void largestnumber_in_collections() {
		
		try(Scanner in = new Scanner(System.in)) { // this is 'try-with-resources' feature was introduced in Java 7 , Java will automatically close this Scanner instance when the try block is finished.
			ArrayList<Integer> list = new ArrayList<>();
			
			System.out.println("Enter the array size: ");
			int size = in.nextInt();
			
			if(size<=0) {
				System.out.println("Array size cant be negative or zero");
				return;
			}
			
			for (int i = 0; i < size; i++) {
				list.add(in.nextInt());
			}
			
			System.out.println("Max value is " + Collections.max(list));
		}
		catch(Exception e) {
			System.out.println("Error " + e);
		}
	}

	
	static void copyArray() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		int[] copyarr = new int[size];
		int[] copyarr = arr.clone();
//		System.arraycopy(arr, 1, copyarr, 2, 3);
//		int[] copyarr = Arrays.copyOf(arr , size);
//		int[] copyarr = Arrays.copyOfRange(arr, 0, size);
		
		System.out.println(Arrays.toString(copyarr));
		in.close();
	}
	
	
	static void arraysEqual_predefined() {
		
		try(Scanner in = new Scanner(System.in)){
			
			System.out.println("Enter the size of the array1: ");
			int size = in.nextInt();
			
			System.out.println("Enter the size of the array2: ");
			int size2 = in.nextInt();
			
			if(size != size2) {
				System.out.println("Arrays will not be equal, coz size is not equal");
				return;
			}
			
			int[] arr = new int[size];
			System.out.println("Enter the numbers: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			
			
			int[] arr2 = new int[size2];
			System.out.println("Enter the numbers: ");
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = in.nextInt();
			}
			
			if(Arrays.equals(arr, arr2)) {
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("Arrays are not equal");
			}
			
		}
		catch(Exception e) {
			System.out.println("Error " +e);
		}
		
	}
	
	
	static void arraysEqual_no_predefined() {
		try(Scanner in = new Scanner(System.in)){
			System.out.println("Enter the size of the array1: ");
			int size = in.nextInt();
			
			System.out.println("Enter the size of the array2: ");
			int size2 = in.nextInt();
			
			boolean result = true;
			
			if(size == size2) {
				int[] arr = new int[size];
				System.out.println("Enter the numbers: ");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = in.nextInt();
				}
				
				
				int[] arr2 = new int[size2];
				System.out.println("Enter the numbers: ");
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = in.nextInt();
				}
				
				
				
				for (int i = 0; i < arr.length; i++) {
					if(arr[i] != arr2[i]) {
						result = false;
						break;
					}
				}
				
			} else {
				result = false;
			}
			
			if(result) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}
			
		}
		catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	
	
	static void matrix_no_predefined() {
		try(Scanner in = new Scanner(System.in)){
			System.out.println("Enter the size of the row1: ");
			int row1 = in.nextInt();
			
			System.out.println("Enter the size of the column1: ");
			int column1 = in.nextInt();
			
			System.out.println("Enter the size of the row2: ");
			int row2 = in.nextInt();
			
			System.out.println("Enter the size of the column2: ");
			int column2 = in.nextInt();
			
			boolean isEqual = true;
			
			if(row1 == row2 && column1 == column2) {
				int[][] arr1 = new int[row1][column1];
				int[][] arr2 = new int[row2][column2];
				
				for (int i = 0; i < row1; i++) {
					System.out.println("Enter " + column1 + " numbers : ");
					for (int j = 0; j < column1; j++) {
						arr1[i][j] = in.nextInt();
					}
				}
				
				for (int i = 0; i < row2; i++) {
					System.out.println("Enter " + column2 + " numbers : ");
					for (int j = 0; j < column2; j++) {
						arr2[i][j] = in.nextInt();
					}
				}
				
				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < column1; j++) {
						if(arr2[i][j] != arr2[i][j]) {
							isEqual = false;
							break;
						}
						if(isEqual) {
							break;
						}
					}
				}
				
			} else {
				isEqual = false;
			}
				
			if(isEqual) {
				System.out.println("Matrix equal");
			} else {
				System.out.println("Matrix not equal");
			}
		
			
		}
		catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
