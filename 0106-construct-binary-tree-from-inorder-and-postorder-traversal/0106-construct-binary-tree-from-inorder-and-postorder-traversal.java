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
    HashMap<Integer,Integer> map=new HashMap<>();
    int postidx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       postidx=postorder.length-1;
       return solve(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode solve(int[] inorder,int[]postorder,int left,int right){
         if(left>right) return null;
         int rootval=postorder[postidx--];
         TreeNode root=new TreeNode(rootval);
         int mid=map.get(rootval);
         root.right=solve(inorder,postorder,mid+1,right);
         root.left=solve(inorder,postorder,left,mid-1);
         return root;
    }
}