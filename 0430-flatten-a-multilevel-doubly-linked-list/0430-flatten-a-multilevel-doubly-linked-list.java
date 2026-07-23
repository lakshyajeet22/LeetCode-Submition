/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
                continue;
            } else {
                Node temp = curr.next;
                Node cr = curr.child;

                while (cr.next != null) {
                    cr = cr.next;
                }
                curr.next = curr.child;
                curr.next.prev = curr;
                cr.next = temp;
                cr.next = temp;
                if (temp != null) {
                    temp.prev = cr;
                }
                curr.child = null;
            }
            curr=curr.next;

        }
        return head;
    }
}