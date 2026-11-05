class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]= new int[nums.length*2];
        int n=nums.length;
        int i=0;
        while(i<n){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
            i++;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna