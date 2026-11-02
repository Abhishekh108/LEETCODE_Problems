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
    public TreeNode sortedArrayToBST(int[] arr) {
        // TreeNode root= new TreeNode();
        // int mid=(0+arr.length-1)/2;
        // root.val=arr[mid];
        return helper(0, arr.length-1, arr);
    }
    public TreeNode helper(int low, int high, int[] arr) {
    if(low > high) return null;
    int mid = low + (high-low)/2;
    TreeNode temp = new TreeNode(arr[mid]);
    temp.left = helper(low, mid-1, arr);
    temp.right = helper(mid+1, high, arr);
    return temp;
}

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna