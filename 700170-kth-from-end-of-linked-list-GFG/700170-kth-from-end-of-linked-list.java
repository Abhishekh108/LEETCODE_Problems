/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node slow=head;
        Node fast=head;
        Node count =head;
        int len=0;
        while(count!=null){
            len++;
            count=count.next;
        }
        if(k>len) return -1;
        
        
        
        int i=0;
        while(i<k){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna