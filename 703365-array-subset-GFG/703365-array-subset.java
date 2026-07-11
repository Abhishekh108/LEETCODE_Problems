class Solution {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : a) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int ele : b) {

            if (!map.containsKey(ele)) {
                return false;
            }

            map.put(ele, map.get(ele) - 1);

            if (map.get(ele) < 0) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna