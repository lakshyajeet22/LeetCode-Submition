/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(-1);
        Node temp = head;
        Map<Node, Node> map = new HashMap<>();
        Node d = dummy;
        while(temp!=null){
            d.next=new Node(temp.val);
            d=d.next;
            map.put(temp, d);
            temp=temp.next;
        }
        temp=head;
        d=dummy.next;
        while(temp!=null){
            d.next=map.get(temp.next);
            d.random = map.get(temp.random);
            temp=temp.next;
            d=d.next;
        }
        return dummy.next;

    }
}