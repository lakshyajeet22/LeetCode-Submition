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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return  ans;
        q.offer(root);
        int j=0;
        while(!q.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            TreeNode s;
            int n = q.size();
            for(int i=0; i<n; i++){
                s=q.poll();
                if(j%2==0)  temp.add(s.val);
                else    temp.addFirst(s.val);
                if(s.left!=null) q.offer(s.left);
                if(s.right!=null) q.offer(s.right);

            }
            j++;
            ans.add(temp); 
        }
        return ans;
    }
}