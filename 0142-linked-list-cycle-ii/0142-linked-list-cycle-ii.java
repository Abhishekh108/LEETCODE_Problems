/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if( head== null || head.next==null) return null;
        while( fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        //slow and fast are at the metting point
       if (fast == null || fast.next == null) return null;

        while(head != slow){
            head=head.next;
            slow=slow.next;
        }
        return head;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna