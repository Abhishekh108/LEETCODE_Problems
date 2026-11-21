class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:stones){
            q.add(ele);
        }
        while(q.size()>2){
            int a= q.remove();
            int b= q.remove();
            if(a !=b){
                q.add(a-b);
            }
        }
        if(q.size()==2){
            return q.remove()-q.remove();
        }
        return q.poll();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna