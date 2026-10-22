class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int n=arr.length;
        int m=(1<<n);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> a= new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j) % 2==1){ //find 1 position
                    a.add(arr[j]);
                }
            }
            ans.add(a);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna