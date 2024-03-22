package dailyLeetcode;

public class Palindrome_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Test cases
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
        
        Palindrome_Solution solution = new Palindrome_Solution();
        
        System.out.println("Is list1 a palindrome? " + solution.isPalindrome(list1));
        System.out.println("Is list2 a palindrome? " + solution.isPalindrome(list2));
        System.out.println("Is list3 a palindrome? " + solution.isPalindrome(list3));
    
	}

}
class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next; 
    }
}

class Palindrome_Solution {
    public boolean isPalindrome(ListNode head) {
    	
    	 if (head == null || head.next == null) {
             return true;
         }
    	 
    	int[] array = new int[100_000];
    	int size = 0;
    	
        while(head!=null){
            array[size++]= head.val;
            head = head.next;
        }
        
        
        for(int i=0;i<size/2;i++) {
        	if(array[i] != array[size - i - 1]) {
        		return false;
        	}
        }
        
        return true;
    }
}