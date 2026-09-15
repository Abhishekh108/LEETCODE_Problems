class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right= people.length-1;
        int count =0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
                count++;
            }
            else{
                // [1,2,2,3] limt=3
                //  l     R
                right--;
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna