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
    public int tre(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(tre(root.left), tre(root.right)) +1;
       


    }
    public int maxDepth(TreeNode root) {
        return tre(root);
    }
}