class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minCost = new int[n];

        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[0] = 0;

        int total = 0;

        for (int count = 0; count < n; count++) {
            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || minCost[i] < minCost[u])) {
                    u = i;
                }
            }

            visited[u] = true;
            total += minCost[u];

            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int distance = Math.abs(points[u][0] - points[v][0])
                            + Math.abs(points[u][1] - points[v][1]);

                    minCost[v] = Math.min(minCost[v], distance);
                }
            }
        }

        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna