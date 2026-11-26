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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        fun(root);
        return flag;
    }
    int fun(TreeNode root){
        if(root==null) return 0;
        int lh=fun(root.left);
        int rh=fun(root.right);
        if(Math.abs(lh-rh)>1) flag=false;
        return Math.max(lh,rh)+1;
    }
}