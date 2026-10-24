class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<str.length;i++){
            List<String>al= new ArrayList<>();
            al.add(str[i]);
            if(set.contains(i))continue;
            for(int j=i+1;j<str.length;j++){
                if(isanagram(str[i],str[j])==true){
                    al.add(str[j]);
                    set.add(j);
                }
            }
            ans.add(al);
        }
        return ans;
    }
    public boolean isanagram(String s, String t){
        
        if(s.length() !=t.length()) return false;
        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
        // Arrays.sort(a); 
        // Arrays.sort(b); 
        // return Arrays.equals(a, b); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna