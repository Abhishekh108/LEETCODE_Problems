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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        // Stores the final answer
        List<List<Integer>> ans = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null)
            return ans;

        // Queue for BFS
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // true -> Left to Right
        // false -> Right to Left
        boolean leftToRight = true;

        // Traverse until queue becomes empty
        while (!q.isEmpty()) {

            // Number of nodes present at the current level
            int size = q.size();

            // Stores all nodes of the current level
            List<Integer> level = new ArrayList<>();

            // Traverse all nodes of the current level
            for (int i = 0; i < size; i++) {

                // Remove front node from queue
                TreeNode temp = q.remove();

                // Store its value
                level.add(temp.val);

                // Add left child for next level
                if (temp.left != null)
                    q.add(temp.left);

                // Add right child for next level
                if (temp.right != null)
                    q.add(temp.right);
            }

            // If direction is Right to Left,
            // reverse the current level
            if (!leftToRight) {
                Collections.reverse(level);
            }

            // Add current level to answer
            ans.add(level);
            // Add current level into final answer
           // ans.addAll(level);  thsi is for GFG

            // Change direction for the next level
            leftToRight = !leftToRight;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna