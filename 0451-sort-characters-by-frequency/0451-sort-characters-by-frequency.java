class pair implements Comparable<pair>{
    char ch;
    int freq;
    pair(char ch, int freq){
        this.ch=ch;
        this.freq=freq;
    }
    public int compareTo(pair that){
        return Integer.compare(that.freq,this.freq);
        //we are arranging thsi in ascending order
    }
}

class Solution {
    public String frequencySort(String str) {
        HashMap<Character ,Integer> map= new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<pair> pq= new PriorityQueue<>();

        for( char ch:map.keySet()){
            pq.add(new pair(ch, map.get(ch)));
        }
        //make string builder bcz it is immutable

        StringBuilder ans= new StringBuilder();

        while(!pq.isEmpty()){
            pair p= pq.poll();

            for( int i=0;i<p.freq;i++){
                ans.append(p.ch);
            }
        }
         return ans.toString();


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna