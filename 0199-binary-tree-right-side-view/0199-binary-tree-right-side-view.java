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
    void solve(List<Integer> ans, TreeNode root, int l){
        if(root==null) return;
        if(ans.size()==l) ans.add(root.val);
        solve(ans, root.right, l+1);
        solve(ans, root.left, l+1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(ans, root, 0);
        return ans;
    }
}