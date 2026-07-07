class Solution {
    static int count;
    public int reversePairs(int[] arr) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }

    static void mergeSort(int arr[], int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    static void merge(int arr[], int start, int mid, int end) {

        // count reverse pairs BEFORE overwriting arr[] into temp[]
        int p = mid + 1;
        for (int x = start; x <= mid; x++) {
            while (p <= end && arr[x] > 2L * arr[p]) {   // 2L to avoid overflow
                p++;
            }
            count += (p - (mid + 1));
        }

        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna