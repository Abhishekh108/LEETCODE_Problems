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
    int lev=-1;
    int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return -1;
         leftvalue(root,0);
         return ans;
    }
    public void leftvalue(TreeNode root,int level){
        if(root==null) return ;
        if(lev<level){
             ans=root.val;
            lev=level;
        }
        leftvalue(root.left, level+1);
        leftvalue(root.right,level+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna