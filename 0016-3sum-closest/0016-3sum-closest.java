class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int ans=0;
        int prev=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                int check=Math.abs(target-sum);
                if(check<prev){
                    prev=check;
                    ans=sum;
                }
                if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
            }

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna