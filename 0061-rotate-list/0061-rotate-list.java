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
    public static int count(ListNode head){
        ListNode temp = head;
        int count =0;
        while(temp!= null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        int n=count(head);
        if(n==0) return head;
        k=k%n;
        if(k==0 ) return head;
        if( head==null || head.next==null || k==n) return head;
        
        
        ListNode slow = head;
        ListNode fast= head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        } 
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }

        //[1,2,3,(4),5---null  k=2
        //     s    fast
        ListNode nhead= slow.next; // pointing 4
        slow.next=null;
        fast.next=head;
        head=nhead; 


        return head; 

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna