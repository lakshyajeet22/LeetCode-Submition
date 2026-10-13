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
        if(head==null ) return null;
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
                Node n = temp.next;
                Node child = flatten(temp.child);
                temp.next = child;
                child.prev = temp;
                temp.child = null;
                Node x = child;
               while(x.next!=null){
                x=x.next;
               }
               x.next=n;
               if(n!=null) n.prev=x;    
            }  
            temp = temp.next; 
        }
        return head;
    }
}