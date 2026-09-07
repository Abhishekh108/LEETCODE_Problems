/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {

        if (head == null || head.next == null)
            return head;

        //  Reverse
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev; //after teversing this ..become head

        // 2. Remove nodes smaller than max
        int max = head.data;
        curr = head;

        while (curr.next != null) {

            if (curr.next.data < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.data;
            }
        }

        // 3. Reverse again
        prev = null;
        curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna