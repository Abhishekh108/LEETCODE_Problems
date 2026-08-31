class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int mid=0; 
        int high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
               // mid++;
                high--;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                //mid==0
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna