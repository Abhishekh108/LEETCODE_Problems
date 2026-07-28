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
    public int findBottomLeftValue(TreeNode root) {
        int[] arr = new int[2];
        arr[0]=0 ;//arr[0]=ans
        arr[1]=-1;//arr[1]=maxlevel
        solve(root,arr,0);
        return arr[0];
    }
    public void solve(TreeNode root,int arr[], int level){
        if(root==null) return;

        if(level> arr[1]){
            arr[1]=level;
            arr[0]=root.val;

        }
        solve(root.left,arr,level+1);
        solve(root.right,arr,level+1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna