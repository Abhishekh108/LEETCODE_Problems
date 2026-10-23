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
    public int maxLevelSum(TreeNode root) {
        int maxsum=Integer.MIN_VALUE;
        int maxlevel=0;
        int level=0;
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            level++;
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr= q.poll();
                sum+=curr.val; //work
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);

            }
            if(sum>maxsum){
                maxsum=sum;
                maxlevel=level;
            } 

        }
        return maxlevel;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna