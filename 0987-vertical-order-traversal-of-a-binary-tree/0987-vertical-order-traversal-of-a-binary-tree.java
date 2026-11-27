class Pair {
    int row, col;
    TreeNode node;
    Pair(int row, int col, TreeNode node){
        this.row = row;
        this.col = col;
        this.node = node;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, 0, root));
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            int row = temp.row;
            int col = temp.col;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new ArrayList<>());
            map.get(col).get(row).add(temp.node.val);
            if (temp.node.left != null)
                q.offer(new Pair(row + 1, col - 1, temp.node.left));
            if (temp.node.right != null)
                q.offer(new Pair(row + 1, col + 1, temp.node.right));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int col : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            for (int row : map.get(col).keySet()) {
                List<Integer> values = map.get(col).get(row);
                Collections.sort(values);
                temp.addAll(values);
            }
            ans.add(temp);
        }
        return ans;
    }
}