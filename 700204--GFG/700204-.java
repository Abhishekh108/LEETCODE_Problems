
class Solution {
    void left(ArrayList<Integer> ans, Node root) {
        if (root == null) return;

        if (root.left != null || root.right != null)
            ans.add(root.data);

        if (root.left != null)
            left(ans, root.left);
        else
            left(ans, root.right);
    }

    void leaves(ArrayList<Integer> ans, Node root) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }

        leaves(ans, root.left);
        leaves(ans, root.right);
    }

    void right(ArrayList<Integer> ans, Node root) {
        if (root == null) return;

        if (root.right != null)
            right(ans, root.right);
        else
            right(ans, root.left);

        if (root.left != null || root.right != null)
            ans.add(root.data);
    }

    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return ans;
        }

        ans.add(root.data);

        left(ans, root.left);
        leaves(ans, root.left);
        leaves(ans, root.right);
        right(ans, root.right);

        return ans;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna