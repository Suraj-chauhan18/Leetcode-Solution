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
    int preidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        preidx=postorder.length-1;
        return solve(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode solve(int[]inorder,int[]postorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootValue=postorder[preidx];
        TreeNode root=new TreeNode(rootValue);
        int idx=left;
        preidx--;
        while(inorder[idx]!=rootValue){
            idx++;
        }
        root.right=solve(inorder,postorder,idx+1,right);
        root.left=solve(inorder,postorder,left,idx-1);
        return root;
    }
}