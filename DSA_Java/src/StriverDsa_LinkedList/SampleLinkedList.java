package StriverDsa_LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int data , Node next){
		this.data = data;
		this.next = next;
	}
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SampleLinkedList {
	
	private static Node convertArrtoLL(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i = 1; i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}
	
	private static boolean checkElementPresent(Node head , int search) {
		Node mover = head;
		
		while(mover != null) {
			if(search == mover.data) {
				return true;
			}
			mover = mover.next;
		}
		
		return false;
	}
	
	private static Node deleteHeadOrFirstElement(Node head) {
		if(head == null) return head;
		head = head.next;
		return head;
	}
	
	private static Node deleteTailOrLastElement(Node head) {
		if(head == null || head.next == null) return null;
		
		Node temp = head;
		while(head.next.next != null) {
			head = head.next;
		}
		head.next = null;
		return temp;
	}
	
	private static Node deleteKthNode(Node head , int k) {
		
		if(head ==null) return head;
		
		int count = 0;
		Node temp = head;
		Node prev = null;
		
		while(temp != null) {
			count++;
			if(count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}

		return head;
	}
	
	private static void displayLL(Node head) {
		if(head == null)
		{
			System.out.println("null");
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,3,1,5,6};
		
		Node ans = convertArrtoLL(arr);
//		System.out.println(ans.data);
		displayLL(ans);
		
		boolean answer = checkElementPresent(ans , 5);
		System.out.println(answer);
		
		ans = deleteHeadOrFirstElement(ans);
		displayLL(ans);
		
		ans = deleteTailOrLastElement(ans);
		displayLL(ans);
		
		ans = deleteKthNode(ans , 3);
		displayLL(ans);


	}

}
