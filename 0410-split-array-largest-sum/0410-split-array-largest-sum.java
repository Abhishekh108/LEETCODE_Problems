class Solution {
    public int splitArray(int[] arr, int k) {
        //[7,2,5,10,8]

        int ans=0;
        int low=arr[0];  //max element in array so that largest subarray sum is minimum
        int high=arr[0];  //if k =1 then largest subarray sum = sum of all element
        for(int i=1;i<arr.length;i++){
            if(arr[i]>low){
                low=arr[i];
            }
            high +=arr[i];
        }

        // low= 10   high=32
        while(low <=high){
            int mid= low+(high-low)/2; //now mid will pass as maxmum

            // Can we split the array into <= k parts
            // such that every part has sum <= mid?
            if(cansplit(arr,k,mid)){
                ans=mid;

                //mid is possible as maxsubarray but we have to find the minimum of maxsubarray
                high=mid-1;  
            }
            else{
                // mid is not possible
                // need a bigger maximum sum
                low = mid + 1;
            }

        }
        return ans;
        
    }
    public boolean cansplit(int nums[],int k,int maxsum){
        // int mid= maxsum
        int sum=0;
        int part=1;
        for(int num: nums){
            if(sum+num <= maxsum){
                sum +=num;
            }
            else{
                part++;
                sum=num;
            }
        }
        return part<=k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna