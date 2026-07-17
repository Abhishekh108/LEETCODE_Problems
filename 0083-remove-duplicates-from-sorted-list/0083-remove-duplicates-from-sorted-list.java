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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        if(head==null) return head;
        while(b != null){
            if( a.val==b.val){
                b=b.next;
            }
            //[1,1,2,3,3]
                        
            else{
                // not equal so link
                a.next=b;
                a=b;

            }
            // for last element when b is at null
           
        }
         a.next=b;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna