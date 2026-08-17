class Solution {
    int idx=0;
    public TreeNode tre(int[] p, int[] i, int s, int e, HashMap<Integer, Integer> map){
        if(s>e) return null;
        TreeNode root = new TreeNode(p[idx++]);
        root.left = tre(p, i, s, map.get(root.val)-1,  map);
        root.right = tre(p, i, map.get(root.val)+1, e,   map);
        return root;

    }
    public TreeNode buildTree(int[] p, int[] i) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<i.length; j++){
            map.put(i[j], j);
        }
        return tre(p, i, 0, i.length-1,  map);
    }
}