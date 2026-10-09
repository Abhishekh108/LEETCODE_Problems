/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //counting length of l1
        int l1=0;
        ListNode temp1= headA;
        while(temp1 !=null){
            // 1->2->3->4->5->null
            // h  1  2  3  4  5
            temp1=temp1.next;
            l1++;
        }
        int l2=0;
        ListNode temp2= headB;
        while(temp2!=null){
            // 1->2->3->4->5->null
            // h  1  2  3  4  5
            temp2=temp2.next;
            l2++;
        }
        temp1=headA;
        temp2=headB;
        ///check which is greater and then start the node from there
         if(l1>l2){
            for(int i=1; i<=(l1-l2);i++){
                temp1=temp1.next;
            }  
         }
         else{
            for(int i=1; i<=(l2-l1);i++){
                temp2=temp2.next;
            }  
         }
        while(temp1 != temp2){
            temp1=temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
        

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna