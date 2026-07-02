class Solution {
    public List<String> powerSet(String s) {
        List<String>list = new ArrayList<>();
        subset("",s,0,list);
        Collections.sort(list);
        return list;
        
    }
    public void subset(String ans,String s,int idx, List<String> list){
        if(idx == s.length()){
            //if(ans.length() !=0) 
            list.add(ans);  //this if is to remove the last empty subset
            return;
        }
        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1,list);   //put 
        subset(ans,s,idx+1,list);  //skip
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna