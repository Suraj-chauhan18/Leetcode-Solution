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
    int preidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return solve(preorder,inorder,0,inorder.length-1); 
    }
    public TreeNode solve(int[]preorder,int[]inorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootValue=preorder[preidx++];
        TreeNode root=new TreeNode(rootValue);
        int index=left;
        while(inorder[index]!=rootValue){
            index++;
        }
         root.left=solve(preorder,inorder,left,index-1);
         root.right=solve(preorder,inorder,index+1,right);
         return root;
    }
}