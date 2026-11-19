class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        find(root, targetSum, temp, ans);

        return ans;
    }

    public void find(TreeNode root, int targetSum, List<Integer> temp, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }

        temp.add(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                ans.add(new ArrayList<>(temp));
            }
        }

        find(root.left, targetSum, temp, ans);
        find(root.right, targetSum, temp, ans);

        temp.remove(temp.size() - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna