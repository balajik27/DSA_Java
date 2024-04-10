package dailyLeetcode;
import java.util.*;
public class Number_of_Students_Unable_to_Eat_Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countStudents(new int[] {1,1,0 ,0} , new int[] {0 , 1, 0 ,1 });
	}

	static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackStud = new Stack<>();

        for(int i=sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
            stackStud.push(students[i]);
        }

        for(int i=0;i<students.length;i++){
            if(stackStud.peek() == stack.peek()){
                stack.pop();
                stackStud.pop();
            } else {
                rotate(students , 1 , students.length-1);
                rotate(students , 0 , students.length-1);
                System.out.println(students.toString());
            }
        }

        

        return students.length;
    }

   
    static void rotate(int[] arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(arr.toString());
    }

}


