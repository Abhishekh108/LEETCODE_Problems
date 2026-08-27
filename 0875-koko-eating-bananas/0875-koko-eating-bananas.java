class Solution {
    public boolean ispossible(int []piles,int hour, int mid){
        //mid = speed;
        long timetaken=0;
        // make it long bcz timetaken +=...
        for(int i=0;i<piles.length;i++){
            if(piles[i]% mid==0){
                timetaken +=(piles[i]/mid);
            }
            else{
                //not clearly divisible
                timetaken +=(piles[i]/mid)+1;
            }
        } //hous= he return after X hour
        return timetaken<= hour;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        int ans=0;
        for(int i=1;i<piles.length;i++){
            high= Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(ispossible(piles,h,mid)){
                ans=mid;
                // F F T T T T T T 
                //       m   
                high=mid-1;  
            }
            else{
                //F F F F F T T T 
                //    m
                low=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna