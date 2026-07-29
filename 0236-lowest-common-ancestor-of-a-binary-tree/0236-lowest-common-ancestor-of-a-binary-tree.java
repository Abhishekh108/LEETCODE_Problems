/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root ==q) return root; //if one is root then common is root
        boolean pliesinleft=exists(root.left,p);
        boolean qliesinleft=exists(root.left,q);
        // if p lies in left and q lies in left
        if(pliesinleft && qliesinleft){
          return  lowestCommonAncestor(root.left,p,q);
        }
        else if( !pliesinleft && !qliesinleft){
           return lowestCommonAncestor(root.right,p,q);
        }
        return  root;

    }
    public boolean exists(TreeNode root, TreeNode val){
        if(root==null) return false;
        if(root==val)return true;
        return exists(root.left,val) || exists(root.right,val);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna