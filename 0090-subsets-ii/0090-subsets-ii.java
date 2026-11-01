class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        solve(arr,0,temp,ans);
        return ans;
    }
    public void solve(int[]arr,int idx,List<Integer>temp,List<List<Integer>>ans){
        //base condition
        if(idx==arr.length){
            List<Integer> demo= new ArrayList<>(temp);
            if(ans.contains(demo)) return ;
            ans.add(demo);
            return ;
        }
        //explore
        temp.add(arr[idx]);
        solve(arr,idx+1,temp,ans);

        //undo
        temp.remove(temp.size()-1);
        solve(arr,idx+1,temp,ans);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna