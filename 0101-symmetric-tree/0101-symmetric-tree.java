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
    public boolean identical(TreeNode r1, TreeNode r2){
        if(r1== null && r2==null) return true;
        if(r1==null || r2==null ) return false;
        if(r1.val!=r2.val) return false;

        return identical(r1.left,r2.right) && identical(r1.right,r2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return identical(root.left,root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna