class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int low=0;
         int high=arr.length-1;
         int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                // 1 2 3 4 5 6
                //    
                low=mid+1;
               
            }
            else{ //arr[mid]>target
                ans=mid;
                high=mid-1;
            }
        }
        return arr[ans] ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna