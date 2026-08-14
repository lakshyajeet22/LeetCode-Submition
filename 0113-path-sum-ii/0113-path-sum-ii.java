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
    public void sum(TreeNode root, int t, List<List<Integer>> ans, List<Integer> curr){
        if(root==null) return;
        curr.add(root.val);
        if(root.left==null && root.right==null){
            if(t==root.val){
                
                ans.add(new ArrayList<>(curr));
                curr.removeLast();  
                return;
            }
            else{
                curr.removeLast();
                return;
            }
        }
        
        sum(root.left,  t-root.val, ans, curr);
        sum(root.right, t-root.val, ans , curr);
        curr.removeLast();
        

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        sum(root, targetSum, ans, curr);
        return ans;

    }
}
