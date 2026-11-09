class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer>temp= new ArrayList<>();
        boolean visited[]= new boolean [arr.length];
        helper(arr,temp,ans,visited);
        return ans;
    }
    public void helper(int arr[],List<Integer> temp,List<List<Integer>> ans,boolean visited[]){
        //base
        if(temp.size()==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true) continue;
            
            temp.add(arr[i]);
            visited[i]=true;
            helper(arr,temp,ans,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;

        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna