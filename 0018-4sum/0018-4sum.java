class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {

                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {

                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        al.add(arr[l]);

                        ans.add(al);

                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                    else if (sum > target) {
                        l--;
                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna