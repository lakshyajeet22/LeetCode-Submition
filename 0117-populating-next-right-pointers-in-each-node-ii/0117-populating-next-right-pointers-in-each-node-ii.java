/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root==null) return root;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            Node s;
            LinkedList<Node> curr = new LinkedList<>();
            for(int i=0; i<n; i++){
                s= q.poll();
                if(i < n-1)
                    s.next = q.peek();
                else
                    s.next = null;
                if(s.left!=null) q.offer(s.left);
                if(s.right!=null) q.offer(s.right);
            }
        }
        return root;
    }
}