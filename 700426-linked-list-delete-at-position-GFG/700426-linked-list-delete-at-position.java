/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null) return null;
        if (x==1) return head.next;
       
        
        // int length=0;
        Node temp=head;
        // while(temp !=null){
        //     length++;
        //     temp=temp.next;
        //  }
         
         
        //  if(x>length) return null;
                
         int i=1;
         temp=head;
         while (i<x-1){
             temp=temp.next;
             i++;
         }
        temp.next=temp.next.next;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna