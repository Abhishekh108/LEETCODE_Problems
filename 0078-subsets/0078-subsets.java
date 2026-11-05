class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        helper(nums,0,ans,temp);
        return ans;
    }
    public void helper(int []arr,int idx,List<List<Integer>> ans,List<Integer> temp){
        //base
        if(idx==arr.length){
            ans.add(new ArrayList(temp));
            return ;
        }
        //explore
        temp.add(arr[idx]);
        helper(arr,idx+1,ans,temp);

        //backtracking
        temp.remove(temp.size()-1);
        helper(arr,idx+1,ans,temp);
        


        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna