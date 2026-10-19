class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        int n=days[days.length-1]; // we want last value20
        int dp[]= new int [n+1];
        dp[0]=0;
        HashSet<Integer>set = new HashSet<>();
        for(int ele: days){
            set.add(ele);
        }
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                // int day1=cost[0]+dp[i-1]; what if dp[(i-1)<0]
                int day1=cost[0]+dp[Math.max(i-1,0)];
                int day7=cost[1]+dp[Math.max(i-7,0)];
                int day30= cost[2]+dp[Math.max(i-30,0)];
                dp[i]=Math.min(day1,Math.min(day7,day30));
            }
            else{
                dp[i]=dp[i-1];
            }

        }
        return dp[n];
    }
}


// class Solution {
//     public int mincost(int days[],int costs[],int i,int dp[]){
//         int n=days.length;
//         if(i>=n){
//             return 0;
//         }
//         if(dp[i]!=-1){
//             return dp[i];
//         }
//         int day_1=costs[0]+mincost(days,costs,i+1,dp);

//         //7days
//         int j=i;
//         int maxday=days[i]+7;
//         while(j<n && days[j]<maxday){
//             j++;
//         }
//         int day_7=costs[1]+mincost(days,costs,j,dp);

//         j=i;
//         maxday=days[i]+30;
//         while(j<n && days[j]<maxday){
//             j++;
//         }
//         int day_30=costs[2]+mincost(days,costs,j,dp);

//         return dp[i]= Math.min(day_1,Math.min(day_7,day_30));

//     }
//     public int mincostTickets(int[] days, int[] costs) { 
//         int dp[]= new int[days.length+1];
//         Arrays.fill(dp,-1);
//         return mincost(days,costs,0,dp);
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna