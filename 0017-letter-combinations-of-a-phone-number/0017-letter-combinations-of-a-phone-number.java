class Solution {
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        if(digits.length()==0) return ans;

        helper(0,digits,"",ans);
        return ans;
        
    }
    public void helper(int idx,String digits,String temp,List<String>ans){
        if(idx>=digits.length()){
            ans.add(temp);
            return;
        }
        int num=digits.charAt(idx)-'0';
        String str= arr[num];
        for(int i=0;i<str.length();i++){
            String newtemp= temp+str.charAt(i);
            helper(idx+1,digits,newtemp,ans);
        }

    }
}

//     public List<String> letterCombinations(String digits) {
//         List<String> ans = new ArrayList<>();

//         if(digits.length() == 0) return ans;

//         StringBuilder temp = new StringBuilder();

//         helper(0, digits, temp, ans);

//         return ans;
//     }

//     public void helper(int idx, String digits, StringBuilder temp, List<String> ans) {

//         if(idx >= digits.length()) {
//             ans.add(temp.toString());
//             return;
//         }

//         int num = digits.charAt(idx) - '0';
//         String str = arr[num];

//         for(int i = 0; i < str.length(); i++) {

//             temp.append(str.charAt(i));

//             helper(idx + 1, digits, temp, ans);

//             temp.deleteCharAt(temp.length() - 1);
//         }
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna