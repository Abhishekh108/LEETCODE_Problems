/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        boolean flag= false;
        Node temp1=head1;
        Node temp2=head2;
        
        while( temp1 !=null && temp2 !=null){
            if(temp1.data != temp2.data) return false;
            temp1= temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null || temp2 !=null)  return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna