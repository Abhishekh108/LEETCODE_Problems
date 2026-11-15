class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         ArrayList<Integer> ans = new  ArrayList<>();
         Queue<Integer> q= new LinkedList<>();
         //start =0;
         q.add(0);
         boolean visited[]= new boolean[adj.size()];
         visited[0]=true;
         
         while(!q.isEmpty()){
             
             int temp=q.remove();
             ans.add( temp);
             
            //  if (adj[node][i] == 1 && !visited[i]) {
            //                      visited[i] = true;
             
             for( int i :adj.get(temp)){
                 if(!visited[i] ){
                     visited[i]=true;
                     q.add(i);
                 }
             }
         }
         return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna