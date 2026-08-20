class project implements Comparable<project>{
    int profit;
    int capital;
    project(int profit, int capital){
        this.profit=profit;
        this.capital=capital;
    }
    public int compareTo(project that){
        return Integer.compare(this.capital, that.capital);
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<project> minpq= new PriorityQueue<>();
        
        int n=capital.length;
        for( int i=0;i<n;i++){
            minpq.add(new project(profits[i],capital[i]));
        }
        PriorityQueue<Integer> maxpq= new PriorityQueue<>(Collections.reverseOrder());
        
        //int k = no. of project
        while(k>0){

            while(!minpq.isEmpty() && minpq.peek().capital<=w){ //w = initial capital
                maxpq.add(minpq.poll().profit);
            }
            if(maxpq.isEmpty()) break;
            w +=maxpq.poll();
            k--;
        }
        return w;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna