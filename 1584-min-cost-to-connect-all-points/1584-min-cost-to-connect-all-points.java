class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[][] cost = new int[n][n];
        boolean[] visited = new boolean[n];

        // Build the cost matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = Math.abs(points[i][0] - points[j][0])
                        + Math.abs(points[i][1] - points[j][1]);
            }
        }

        visited[0] = true;
        int edge = 0;
        int total = 0;

        while (edge < n - 1) {
            int min = Integer.MAX_VALUE;
            int u = -1;
            int v = -1;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && cost[i][j] < min) {
                            min = cost[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            visited[v] = true;
            total += min;
            edge++;
        }

        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna