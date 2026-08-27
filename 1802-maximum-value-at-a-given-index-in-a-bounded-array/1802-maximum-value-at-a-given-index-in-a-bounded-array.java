class Solution {

    public long sum(int count, int mid) {

        // count - mid tells us whether we reach 1

        if (count - mid < 0) {

            // Example: count = 4, mid = 5
            // 2 3 4 5

            int first = mid - count + 1;

            return (long)(first + mid) * count / 2;
        }

        else if (count - mid == 0) {

            // Example: count = 5, mid = 5
            // 1 2 3 4 5

            return (long)mid * (mid + 1) / 2;
        }

        else {

            // Example: count = 7, mid = 5
            // 1 1 1 2 3 4 5

            return (long)mid * (mid + 1) / 2
                 + (count - mid);
        }
    }


    public int maxValue(int n, int index, int maxSum) {

        int low = 1;
        int high = maxSum;
        int ans = 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // mid included
            int leftCount = index + 1;
            int rightCount = n - index;

            long leftSum = sum(leftCount, mid);
            long rightSum = sum(rightCount, mid);

            // mid counted twice, so subtract once
            long total = leftSum + rightSum - mid;

            if (total <= maxSum) {

                ans = mid;
                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna