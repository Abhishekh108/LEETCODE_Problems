class Solution {
    public int[] twoSum(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;

        while(low<high){
            if(arr[low]+arr[high]==target){
                return new int[]{low+1,high+1};
            }
            else if(arr[low]+arr[high]>target){
                high--;
            }
            else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna