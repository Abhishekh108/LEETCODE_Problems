/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if (set.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                set.add(temp.data);
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna