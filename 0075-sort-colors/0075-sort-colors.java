class Solution {
    public void sortColors(int[] arr) {
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high){
            // 0 0 0 0 1 1 1 2 2 2
            //       l     m     h
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;mid++;

            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //2
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna