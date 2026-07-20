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
    public ListNode partition(ListNode head, int x) {
        ListNode temp= head;
        ListNode d1= new ListNode (-1); //for less then 3
        ListNode t1= d1;
        ListNode d2= new ListNode (-1);
        ListNode t2= d2;
        if(head==null || head.next==null) return head;
        while(temp!= null){
            if(temp.val>= x){
                t2.next=temp;
                t2=temp;
            }
            else{
                t1.next=temp;
                t1=temp;
            }
            temp=temp.next;
        }// last pos
        t1.next=d2.next;
        t2.next=null;
        // t1 1 2 2 
        //t2 4 3 5
        head= d1.next;
        // 1 2 2
        //     t1
        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna