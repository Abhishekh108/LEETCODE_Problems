class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long sum=0;
        int max=0;
        int i=0; int j=0;
// 1 <= nums.length <= 10^5
// 1 <= nums[i] <= 10^5
// 10000000000
// 2147483647
        while(j<nums.length){
            sum=sum+nums[j];
                        //last element *size
            while((long)nums[j]*(j-i+1)-sum> k){
                sum=sum-nums[i];
                i++;
            }
            max= Math.max(max,j-i+1);

            j++;
        }
        return max;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna