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
        if(p.val ==root.val || q.val==root.val) return root;
        else if(p.val<root.val && q.val>root.val) return root;
        else if(p.val>root.val && q.val<root.val) return root;
        else if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
           return lowestCommonAncestor(root.right,p,q);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna