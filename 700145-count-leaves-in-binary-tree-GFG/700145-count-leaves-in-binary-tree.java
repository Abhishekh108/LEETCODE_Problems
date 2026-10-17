/* Binary Tree node Structure 
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    int count=0;
    int countLeaves(Node root) {
        // code here 
        if(root==null) return count;
        if(root.left==null && root.right==null) count++;
        
        count=countLeaves(root.left);
        count=countLeaves(root.right);
        
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna