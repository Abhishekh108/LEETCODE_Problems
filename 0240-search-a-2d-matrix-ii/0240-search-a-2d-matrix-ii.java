class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int low = 0;
            int high = arr[i].length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[i][mid] == target) {
                    return true;
                } 
                else if (arr[i][mid] < target) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna