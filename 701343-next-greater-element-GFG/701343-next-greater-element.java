class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer> stack= new Stack<>();
        
        
    //     for(int i=0;i<arr.length;i++){
    //         list.add(-1);
    //         for(int j=i;j<arr.length;j++){
    //             if(arr[i]<arr[j]){
    //                 list.set(i, arr[j]);
    //                 break;
    //             }
                
    //         }
            
    //     }
    //   // list.add(-1);
    //     return list;
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                list.add(-1);
                stack.push(arr[i]);
            }
            else{
                if(stack.peek()>arr[i]){
                    list.add(stack.peek());
                    stack.push(arr[i]);
                }
                else{
                    while(!stack.isEmpty() &&stack.peek()<=arr[i]){
                        stack.pop();
                    }
                    if(stack.isEmpty()) {
                        list.add(-1);
                        stack.push(arr[i]);
                    }
                    else{
                        list.add(stack.peek());
                        stack.push(arr[i]);
                    }
                }
            }
        }
        int i=0; int j=list.size()-1;
        while(i<=j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        return list;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna