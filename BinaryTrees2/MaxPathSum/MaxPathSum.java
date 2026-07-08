class Solution {

    int maxSum = Integer.MIN_VALUE;

    int dfs(TreeNode root){

        if(root == null)
            return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        maxSum = Math.max(maxSum, left + right + root.val);

        return root.val + Math.max(left,right);
    }

    public int maxPathSum(TreeNode root){

        dfs(root);      // Start recursion

        return maxSum;  // Return the final answer
    }
}