class Solution {

    static long count;

    static long inversionCount(int arr[]) {
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

        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
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