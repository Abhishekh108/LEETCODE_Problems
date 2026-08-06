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
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {

            // 0 child
            if (root.left == null && root.right == null)
                return null;

            // 1 child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // 2 child
            TreeNode temp = findMin(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }

        return root;
    }

    public TreeNode findMin(TreeNode root) {
        while (root.left != null)
            root = root.left;

        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna