class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        // Create jobs: {deadline, profit}
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }

        // Sort by profit in decreasing order
        Arrays.sort(jobs, (a, b) -> Integer.compare(b[1], a[1]));

        // Find maximum deadline
        int maxDeadline = 0;

        for (int d : deadline) {
            maxDeadline = Math.max(maxDeadline, d);
        }

        // Slots
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int count = 0;
        int totalProfit = 0;

        // Pick jobs according to profit
        for (int[] job : jobs) {

            int d = job[0];
            int p = job[1];

            // Put job in latest possible slot
            for (int j = d; j >= 1; j--) {

                if (slot[j] == -1) {
                    slot[j] = 1;

                    count++;
                    totalProfit += p;

                    break;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(totalProfit);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna