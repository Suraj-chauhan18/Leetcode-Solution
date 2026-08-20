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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> list=new ArrayList<>();
      List<Integer> ans=new ArrayList<>();
      fun(root,targetSum,list,ans);
      return list;
    }
    public void fun(TreeNode root,int target,List<List<Integer>> list,List<Integer>ans){
        if(root==null) return;
        ans.add(root.val);
        if(root.left==null && root.right==null){
            if(target==root.val){
                list.add(new ArrayList<>(ans));
            }
        }
        fun(root.left,target-root.val,list,ans);
        fun(root.right,target-root.val,list,ans);
        ans.remove(ans.size()-1);
    }
}