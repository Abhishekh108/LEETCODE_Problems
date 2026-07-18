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
        // Create a dummy node because the first node
        // may also be deleted.
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr= head;
        while (curr != null) {
            // Check whether duplicates exist
            if(curr.next !=null && curr.val==curr.next.val){
                while(curr.next != null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }
                // Move curr to the last duplicate
                // After loop:
                // 1 -> 1 -> 1 -> 2
                //           c
                // Remove all duplicates
                // Example:
                // dummy -> 1 -> 1 -> 1 -> 2
                //    p                 c
                // Connect dummy directly to 2  (prev.next=curr.next;
  
            
            else {
                // No duplicate found, so move prev
                prev=prev.next;
            }
        curr=curr.next;
            // Move curr every time
           
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna