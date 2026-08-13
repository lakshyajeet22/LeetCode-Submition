class Solution {

    public boolean c(TreeNode left, TreeNode right) {

        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;

        return c(left.left, right.right) &&
               c(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return c(root.left, root.right);
    }
}