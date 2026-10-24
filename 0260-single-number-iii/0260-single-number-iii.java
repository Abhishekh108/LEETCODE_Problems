class Solution {
    public int[] singleNumber(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                set.remove(arr[i]);
            }
        }
        int ans[]= new int[2];
        int i=0;
        for(int ele:set){
            ans[i++]=ele;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna