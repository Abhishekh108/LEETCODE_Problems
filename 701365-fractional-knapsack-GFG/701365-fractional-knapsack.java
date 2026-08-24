class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // sort index according to value/weight ratio
        Arrays.sort(arr, (a, b) ->
            Double.compare(
                (double) val[b] / wt[b],
                (double) val[a] / wt[a]
            )
        );

        double ans = 0;

        for (int i = 0; i < n; i++) {

            int idx = arr[i];

            if (wt[idx] <= capacity) {
                ans += val[idx];
                capacity -= wt[idx];
            }
            else {
                ans += ((double) val[idx] / wt[idx]) * capacity;
                break;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna