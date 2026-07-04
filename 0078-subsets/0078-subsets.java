class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(new ArrayList<>(), nums, 0, list);
        return list;
    }

    public void subset(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list) {

        if (idx == nums.length) {
            list.add(new ArrayList<>(ans));   // store a copy
            return;
        }

        // Take
        ans.add(nums[idx]);
        subset(ans, nums, idx + 1, list);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Skip
        subset(ans, nums, idx + 1, list);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna