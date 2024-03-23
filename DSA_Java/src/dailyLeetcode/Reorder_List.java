package dailyLeetcode;

public class Reorder_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
	        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
	        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
	        
	        
	        Reorder_Solution.reorderList(list2);
	}

}

class Reorder_Solution{
	public static void reorderList(ListNode head) {
		//solved in 3ms - 4th place
		if (head == null || head.next == null) return;
		int[] array = new int[100_000];
		int size = 0;
		ListNode temp = head;
		
		 while(temp!=null){
            array[size++]= temp.val;
            temp = temp.next;
		 }
		 
		 temp = head;
		 for(int i= size-1; i>(size/2); i--) {
			 ListNode node = new ListNode();
			 node.val = array[i];
			 node.next = head.next;
			 head.next = node;
			 head = head.next.next;
			 
		 }
		 if(size%2==0) {
			 head.next.next= null;
		 }else {
			 head.next= null;
		 }

//		 return temp;
		 while(temp!=null) {
			 System.out.println(temp.val);
			 temp = temp.next;
		 }
		 
	}
}

