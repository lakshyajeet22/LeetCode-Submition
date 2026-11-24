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
    boolean solve(TreeNode root, int t){
        if(root==null) return false;
        if(root.left==null && root.right == null){
            if(t==root.val) return true;
            return false;
        }
        return solve(root.left, t-root.val) || solve(root.right, t-root.val);
    }
    public boolean hasPathSum(TreeNode root, int t) {
        return solve(root, t);
    }
}