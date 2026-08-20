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
      public boolean solve(TreeNode root, int targetSum,int sum) {
    if(root==null) return false;
    
    if(root.left==null && root.right==null){
        return sum+root.val==targetSum;
    }
    return solve(root.left,targetSum,sum+root.val) || solve(root.right,targetSum,sum+root.val);
}
    public boolean hasPathSum(TreeNode root, int targetSum) {
    return solve(root,targetSum,0);
}
}