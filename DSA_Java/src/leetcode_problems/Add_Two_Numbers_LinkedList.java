package leetcode_problems;

public class Add_Two_Numbers_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Two_Solution ans = new Add_Two_Solution();
		ListNode l1;
		
//		ans.addTwoNumbers();
	}

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Add_Two_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = l1;
        ListNode temp2 = l2;
        int l1_val = 0;
        int l2_val = 0;

        while(temp!=null || temp2!=null){
            if(temp!=null){
                l1_val = l1_val * 10 + temp.val;
                temp = temp.next;
            }
            if(temp2!=null){
                l2_val = l2_val * 10 + temp2.val;
                temp2 = temp2.next;
            }            
        }

        int rev = 0 , rev2 = 0;
        while(l1_val>0){
            rev = rev * 10 + l1_val % 10;
            l1_val /= 10;
        }
        while(l2_val>0){
            rev2 = rev2 * 10 + l2_val % 10;
            l2_val /= 10;
        }

        int result = rev + rev2;
        if(result == 0) {
            ListNode resultZero = new ListNode(0);
            return resultZero;
        }

        // if(rev > rev2){
        //     result = rev + rev2;
        // } else{
        //     result = rev2 + rev;
        // }

        
  
        ListNode ans = null;

        while(result>0){
            ListNode node = new ListNode(result%10);
            if(ans == null){
                ans = node;
            } else {
                ListNode tempnode = ans;
                while(tempnode.next!=null){
                    tempnode = tempnode.next;
                }
                tempnode.next = node;
            }
            result /= 10;
        }

        return ans;
    }
}