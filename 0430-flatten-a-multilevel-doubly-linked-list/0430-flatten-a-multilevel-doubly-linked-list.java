
class Solution {
    public Node flatten(Node head) {
        Node temp = head;

        while (temp != null) {
            if (temp.child != null) {
                Node n = temp.next;

                temp.next = temp.child;
                temp.child.prev = temp;

                Node x = temp.child;
                temp.child = null;

                while (x.next != null) {
                    x = x.next;
                }

                if (n != null) {
                    n.prev = x;
                }
                x.next = n;
            }

            temp = temp.next;
        }

        return head;
    }
}
