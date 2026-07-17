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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //nth element from the last = total- n (5-2=3)
        //here we have to find out the total element also;;;

        //using Two pointer formula
        ListNode slow=head;
        ListNode fast= head;
        for(int i=0;i<n;i++){
            //if n=2 =>0 1 total 2 
            fast=fast.next;
        }

        //[1,2,3,4,5]
        // s   f
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(fast == null){
            return head.next;
        }
        
        //[1,2,3,4,5-null]
        //   s   f
        if(head.next==null) return null;
        // now slow is at the element -1  position to delete the element
        //[1,2,3,4,5]
        //     s
        
        slow.next=slow.next.next;
        return head;
    }
    // return head;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna