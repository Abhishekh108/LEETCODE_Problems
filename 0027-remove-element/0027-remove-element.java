class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; 
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==val){
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;

            }
           

        }
         return j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna