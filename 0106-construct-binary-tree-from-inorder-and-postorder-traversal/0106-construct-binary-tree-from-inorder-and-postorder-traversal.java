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
    int postidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       postidx=inorder.length-1;
       return solve(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode solve(int[] inorder,int[]postorder,int left,int right){
         if(left>right) return null;
         int rootval=postorder[postidx];
         TreeNode root =new TreeNode(rootval);
         int idx=left;
          postidx--;
         while(inorder[idx]!=rootval){
            idx++;
         }
        
         root.right=solve(inorder,postorder,idx+1,right);
         root.left=solve(inorder,postorder,left,idx-1);
         return root;
    }
}