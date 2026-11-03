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
        if(root==p ||root==q)return root;

        //check if p present in left
        boolean pinleft=ispresent(root.left,p);
        boolean qinleft=ispresent(root.left,q);

        // if(pinleft && !qinleft){ //q right
        //     return root;
        // }
        if(pinleft && qinleft){
          return   lowestCommonAncestor(root.left,p,q);
        }
        else if(!pinleft && !qinleft){
           return  lowestCommonAncestor(root.right,p,q);
        }
        // if(!pinleft && qinleft) return root;
        // return null;
        return root;
    }
    public boolean ispresent(TreeNode root, TreeNode x){
        if(root==null) return false;
        if(root==x) return true;
        return  ispresent(root.left,x) || ispresent(root.right,x);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna