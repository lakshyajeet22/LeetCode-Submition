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
    public boolean tre(TreeNode root, Integer min, Integer max){
        if(root==null ) return true;
        if((min!=null && min>=root.val) || (max!=null && max<=root.val)){
            return false;
        }
        boolean left = tre(root.left, min, root.val);
        boolean right = tre(root.right, root.val, max);
        return left&right;
    }
    public boolean isValidBST(TreeNode root) {
        return tre(root, null, null);
    }
}