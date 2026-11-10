class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>temp= new ArrayList<>();
        boolean visited[]= new boolean[n];
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        helper(0,n,k,arr,temp,ans,visited);
        return ans;

    }
    public void helper(int idx,int n,int k,int[]arr,List<Integer>temp,List<List<Integer>>ans,boolean visited[]){
        if(temp.size()==k){
            ans.add(new ArrayList(temp));
            return ;
        }
        for(int i=idx;i<n;i++){

            if(visited[i]==true)continue;
            temp.add(arr[i]);
            visited[i]= true;
            helper(i+1,n,k,arr,temp,ans,visited);

            temp.remove(temp.size()-1);
            visited[i]=false;
  
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna