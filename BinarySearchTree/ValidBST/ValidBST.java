class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long min, long max) {

        // Base Case
        if(root == null)
            return true;

        // Check current node
        if(root.val <= min || root.val >= max)
            return false;

        // Validate left and right subtree
        return isValid(root.left, min, root.val) &&
               isValid(root.right, root.val, max);
    }
}