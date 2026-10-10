class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle= new ArrayList<>();
        for(int i=1;i<=n;i++){
            circle.add(i);
        }
        
        int idx=0;
        while(circle.size()>1){
            int kill=(idx+k-1)% circle.size();
            circle.remove(kill);
            idx=kill%n;
           // count++;

        }
        return circle.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna