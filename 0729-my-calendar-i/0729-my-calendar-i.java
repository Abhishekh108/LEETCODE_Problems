class MyCalendar {
    TreeMap<Integer,Integer>booking;
    public MyCalendar() {
        booking =new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        // in previous method wwe were using end-1 but not here bcz here at end its already subtracting -1
        booking.put(start,booking.getOrDefault(start,0)+1);
        booking.put(end,booking.getOrDefault(end,0)-1);
        //System.out.println(booking);
            int count =0;

        for(int val :booking.values()){
            count= count+val;
            if(count>1){
                booking.put(start,booking.get(start)-1);
                if(booking.get(start)==0) booking.remove(start);
                booking.put(end,booking.get(end)+1);
                //
                //for optimizing
                
                if(booking.get(end)==0) booking.remove(end);
                return false;
            }
        }
        return true;
    }
}
// class MyCalendar {
//     List<int[]> booking;
//     public MyCalendar() {
//         booking = new ArrayList<>();
//     }
    
//     public boolean book(int start, int end) {
//         if(booking.size()==0){  // firstt  direct entry 
//             booking.add(new int[]{ start , end-1});
//            return true;
//         }
//          //after first check 
//         for(int i=0; i<booking.size();i++ ){
//             int s1=start;
//             int e1= end-1;
//             int s2=booking.get(i)[0];
//             int e2= booking.get(i)[1]; // in adding booking we are already sub -1 above and -1 below
//             if(e2>=s1 && e1>=s2){
//                 //overlapping
//                 return false;
//             }
//         }
//         booking.add(new int[]{ start , end-1});
//         return true;
        
//     }
// }

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna