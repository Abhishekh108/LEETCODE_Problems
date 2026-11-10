class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        boolean []visited= new boolean[nums.length];
        Arrays.sort(nums);

        solve(nums,temp, ans,visited);
        return ans;
    }
    public void solve(int []arr,List<Integer> temp,List<List<Integer>> ans,boolean visited[]){
        if(temp.size()==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        //explore
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true) continue;
            if(i>0 && arr[i]==arr[i-1] && !visited[i-1]) continue;
            //[1,1,2]
            //   i
            //when the i=1 jab recursion start hua ho  all false  tab continue bcz earlier 1 se same ans aya

            temp.add(arr[i]);
            visited[i]=true;
            
            solve(arr,temp,ans,visited);

            temp.remove(temp.size()-1);
            visited[i]=false;

            
        }
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna