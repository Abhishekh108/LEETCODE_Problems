class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        ArrayList<List<Integer>>ans= new ArrayList<>();
        if(arr.length==0) return ans;
        ArrayList<Integer>temp= new ArrayList<>();
        Arrays.sort(arr);
        helper(arr,0,target,ans,temp);
        return ans;
    }
    public void helper(int[]arr, int idx, int target,ArrayList<List<Integer>>ans, ArrayList<Integer>temp){
        if(target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return ;
        if(idx>=arr.length) return ;

        
        //explore
        temp.add(arr[idx]);
        helper(arr,idx+1,target-arr[idx],ans,temp);
        temp.remove(temp.size()-1);

        //not pick
        int next=idx+1;
        while(next<arr.length && arr[next]==arr[idx]){
            next++;
        }
        helper(arr,next,target,ans,temp);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna