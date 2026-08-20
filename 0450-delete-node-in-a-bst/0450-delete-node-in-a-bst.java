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
    public int rep(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root.val; 
    }
    public TreeNode search(TreeNode root, int key){
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null && root.right==null) return null;
            else if(root.left!=null && root.right==null) return root.left;
            else if(root.left==null && root.right!=null) return root.right;
            else{
                int ans = rep(root.right);
                root.val=ans;
                root.right=search(root.right, ans);
            }
            

        }
        else if(root.val<key) root.right=search(root.right, key);
        else root.left = search(root.left,  key);
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return search(root, key);
    }
}