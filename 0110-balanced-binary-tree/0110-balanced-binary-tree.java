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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
       height(root);
       return ans;
    }
    public int height(TreeNode a){
        if(a == null) return 0;
        int left = height(a.left);
        int right = height(a.right);
        if(Math.abs(left-right)>1) ans = false;
        return Math.max(left,right)+1;
    }
}