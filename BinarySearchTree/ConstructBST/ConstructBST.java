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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder , Long.MIN_VALUE , Long.MAX_VALUE);
    }
    private TreeNode build(int[] preorder, long min , long max){
        if(i == preorder.length)
            return null;
        if(preorder[i] < min || preorder[i] > max)
            return null;

        TreeNode root = new TreeNode(preorder[i]);
        i++;

        root.left = build(preorder , min , root.val);

        root.right = build(preorder , root.val , max);

        return root; 
    
    }
}