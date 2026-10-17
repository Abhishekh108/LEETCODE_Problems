/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int size(Node root, int count){
        if(root==null) return count;
        count++;
        count=size(root.left,count);
        
        count =size(root.right,count);
        // return 1+size(root.left)+size(root.right);
        return count;
    }
    public int getSize(Node root) {
        // code here
        int count=0;
         
         return size(root,count);
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna