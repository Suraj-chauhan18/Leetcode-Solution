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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preidx=0;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(inorder,preorder,0,inorder.length-1);
    }
    public TreeNode fun(int[]inorder,int[]preorder,int left,int right){
        if(left>right)  return null;
        int rootval=preorder[preidx++];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.left=fun(inorder,preorder,left,mid-1);
        root.right=fun(inorder,preorder,mid+1,right);
        return root;
    }
}