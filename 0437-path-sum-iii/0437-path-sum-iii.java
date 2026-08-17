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
    int p=0;
    public void sol(TreeNode root, long t){
        if(root==null) return;
        tre(root, t);
        sol(root.left, t);
        sol(root.right, t);
    }
    public void tre(TreeNode root, long t){
        if(root==null) return;
        if(root.val==t){
            p++;
        }

        tre(root.left, t-root.val);
        tre(root.right, t-root.val);

    }
    public int pathSum(TreeNode root, int t) {
        p=0;
        sol(root, t);
        return p;
    }
}