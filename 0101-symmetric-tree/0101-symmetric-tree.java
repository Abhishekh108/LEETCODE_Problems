/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // to check symmetric
        // invert the root.left
        // now check if they are same then they are symmmetric
        mirror(root.left); //to invert
       return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false; //koi ek ho jaye 
        if(p.val != q.val) return false;
        return isSameTree(p.left ,q.left) && isSameTree(p.right,q.right);
    }
    public TreeNode mirror(TreeNode head) {
        TreeNode root= head;
        if( root == null){
            return null;
        }
        TreeNode temp= root.left;
        root.left=root.right;
        root.right= temp;
        mirror(root.left);
        mirror(root.right);
        return head;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna