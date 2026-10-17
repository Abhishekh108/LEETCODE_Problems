/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    int countNonLeafNodes(Node root) {
        // code here
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        
        return 1+countNonLeafNodes(root.left)+countNonLeafNodes(root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna