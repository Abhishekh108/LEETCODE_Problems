class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]= new boolean[rooms.size()];
        int n=rooms.size();
        
        dfs(rooms,visited,0);

        for(boolean ans: visited){
            if(ans==false) return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,boolean [] visited, int start){
        visited[start]= true;

        for(int i :rooms.get(start)){
            if(!visited[i]){
                dfs(rooms,visited,i);
            }
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna