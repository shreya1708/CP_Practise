/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode ln=l1;
         ListNode ln1=l2;
        ListNode a=new ListNode(0);
        ListNode b=a;
        int sum=0;
     
        while(ln!=null||ln1!=null||sum!=0)
      {
        if(ln!=null)
        {
            sum=sum+ln.val;
            ln=ln.next;
        }
        
        if(ln1!=null)
        {
            sum=sum+ln1.val;
            ln1=ln1.next;
        
        }
        b.next=new ListNode((sum)%10);
            sum=sum/10;
        b=b.next;
       }
        
       return a.next; 
    }
}
