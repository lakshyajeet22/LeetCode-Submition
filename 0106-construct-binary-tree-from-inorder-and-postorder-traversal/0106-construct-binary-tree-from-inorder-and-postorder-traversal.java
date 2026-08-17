/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int idx = 0;
    
    public TreeNode tre(int[] p, int[] i, int s, int e, HashMap<Integer, Integer> map){
        if(s>e) return null;
        TreeNode root = new TreeNode(p[idx--]);
       root.right = tre(p, i, map.get(root.val)+1, e, map);
root.left = tre(p, i, s, map.get(root.val)-1, map);
        return root;

    }
    public TreeNode buildTree(int[] i, int[] p) {
         HashMap<Integer, Integer> map = new HashMap<>();
         idx = i.length-1;
        for(int j=0; j<i.length; j++){
            map.put(i[j], j);
        }
        return tre(p, i, 0, i.length-1,  map);
    }
}