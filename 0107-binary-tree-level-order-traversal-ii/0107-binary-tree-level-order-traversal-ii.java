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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> st = new LinkedList<>();
        LinkedList<List<Integer>> ll = new LinkedList<>();
        st.offer(root);
        if(root==null) return new ArrayList<>(ll);
        while(!st.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            int n = st.size();
            for(int i=1; i<=n; i++){
                TreeNode temp = st.poll();
                curr.add(temp.val);
                if(temp.left!=null) st.offer(temp.left);
                if(temp.right!=null) st.offer(temp.right);
            }
            ll.addFirst(curr);
        }
        return new ArrayList<>(ll);
    }
}