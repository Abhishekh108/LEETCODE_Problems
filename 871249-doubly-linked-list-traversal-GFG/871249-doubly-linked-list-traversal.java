/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node temp = head;

        // Forward traversal
        while (temp != null) {
            forward.add(temp.data);
            temp = temp.next;
        }

        // Backward traversal
        temp = head;
        while (temp.next != null) { // bcz to make ele at 
            temp = temp.next;
        }

        while (temp != head) {
            backward.add(temp.data);
            temp = temp.prev;
        }
        backward.add(temp.data);

        ans.add(forward);
        ans.add(backward);

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna