class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<ArrayList<Integer>>set =new HashSet<>();

        boolean visited[]= new boolean[nums.length];
        ArrayList<Integer> temp= new ArrayList<>();
        helper(nums,set,temp,visited);
        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }
    public void helper(int []arr,HashSet<ArrayList<Integer>>set ,ArrayList<Integer> temp,boolean[] visited){
        //base
        if(temp.size()==arr.length){
            set.add(new ArrayList(temp));
            return ;
        }
        //explore 
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true) continue;
            temp.add(arr[i]);
            visited[i]=true;
            helper(arr,set,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }

        //backtracking
        //remove
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna