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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
       solve(root);
       return ans;
    }
    int solve(TreeNode root){
        if(root==null) return 0;
        int lh=solve(root.left);
        int rh=solve(root.right);
        int d=lh+rh;
        ans=Math.max(ans,d);
        return Math.max(lh,rh)+1;
    }
   
}