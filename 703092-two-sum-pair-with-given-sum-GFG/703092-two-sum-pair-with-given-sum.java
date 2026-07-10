class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        //make hash set 2.add element 3. find n-ele if peresnet then true
        
        HashSet<Integer> set = new HashSet<>();
        for( int ele: arr){
            if(set.contains(target-ele)) return true;
            set.add(ele);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna