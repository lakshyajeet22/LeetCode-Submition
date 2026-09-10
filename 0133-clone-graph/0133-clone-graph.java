/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();
        if(node==null) return null;
        q.offer(node);
        map.put(node, new Node(node.val, new ArrayList<>()));
        while(!q.isEmpty()){
            Node temp = q.poll();
            for(Node n : temp.neighbors){
                if(!map.containsKey(n)){
                    map.put(n, new Node(n.val, new ArrayList<>()));
                    q.offer(n);
                }
                map.get(temp).neighbors.add(map.get(n));
            }
        }
        return map.get(node);
    }
}