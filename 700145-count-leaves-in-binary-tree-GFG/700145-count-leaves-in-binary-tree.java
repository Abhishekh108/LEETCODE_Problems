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
    int count=0; //global variable
    
    void solve(Node root){
        if(root==null) return;
        if(root.left ==null && root.right==null) count++;
        solve(root.left);
        solve(root.right);
        
        
    }
    int countLeaves(Node root) {
        // code here  this is one method
        //((( these are single way
        // if(root==null) return count;
        // if(root.left==null && root.right==null) count++;
        
        // count=countLeaves(root.left);
        // count=countLeaves(root.right);
        
        // return count; )))))
         
         solve(root);
         return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna