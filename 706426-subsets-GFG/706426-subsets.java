class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        int n=1<<(arr.length);
        ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> al= new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                //[1 2 3]
                // 0 0 0
                // 0 0 1 
                if((i>>j)%2 !=0){
                    al.add(arr[j]);
                }
            }
            ans.add(al);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna