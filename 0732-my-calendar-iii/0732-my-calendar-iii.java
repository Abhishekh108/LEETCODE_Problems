class MyCalendarThree {
        TreeMap<Integer,Integer> cal;
    public MyCalendarThree() {
        cal = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        int max=0;
        int booking =0;

        cal.put(start,cal.getOrDefault(start,0)+1);
        cal.put(end,cal.getOrDefault(end,0)-1);

        for( int val : cal.values()){
            booking+=val;
            max= Math.max(max,booking);
        }
        return max;

    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna