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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        helper(ans,"",root);
        return ans;
    }
    public void helper(List<String>ans,String temp,TreeNode root){
        if(root==null) return ;
        temp=temp+root.val+"->";
        if(root.left==null && root.right==null){
            ans.add(temp.substring(0,temp.length()-2)); //removing the last->
           // ans.add(temp);
        }

        helper(ans,temp,root.left);
        helper(ans,temp,root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna