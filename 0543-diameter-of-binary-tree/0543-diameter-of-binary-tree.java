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
    int h=0;
    public int tre(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=tre(root.left);
        int r=tre(root.right);
        h=Math.max(r+l, h);
        return Math.max(l,r)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        tre(root);
        
        return h;
    }
}