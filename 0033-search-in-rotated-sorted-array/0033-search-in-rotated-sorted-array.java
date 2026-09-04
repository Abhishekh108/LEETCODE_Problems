class Solution {
    public int search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]<arr[high]){
                if(target>=arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
            else//(arr[mid]>arr[low]){
                {
                if(target>=arr[low] && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }            
            
        }
        return -1;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna