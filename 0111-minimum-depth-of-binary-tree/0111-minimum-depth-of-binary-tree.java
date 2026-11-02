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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                if(curr.left==null && curr.right==null) return level;

            }

        }
        return level;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna