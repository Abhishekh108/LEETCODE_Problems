/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        //find the left hight and right hight
        if(root==null) return true;
        int left= height(root.left);
        int right= height(root.right);
        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna