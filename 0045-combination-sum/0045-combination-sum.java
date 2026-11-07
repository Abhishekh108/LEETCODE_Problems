class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>al =new ArrayList<>();
        helper(candidates,0,target,al,ans);
        return ans;
    }
    public void helper(int[]arr,int idx,int target,List<Integer> al,List<List<Integer>>ans){
        if(target<0) return ;
        if(idx>=arr.length) return ;
        if(target==0){
            ans.add( new ArrayList<>(al));
            return;
        }
        //explore
        al.add(arr[idx]);
        helper(arr,idx,target-arr[idx],al,ans);
        //backtracking 
        // target is premitive so pass by value means another
        //	Separate value in each call	No
        al.remove(al.size()-1);
        helper(arr,idx+1,target,al,ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna