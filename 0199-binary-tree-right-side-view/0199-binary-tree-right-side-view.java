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
    int max=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        solve(root,0,list);
        return list;
        
    }
    void solve(TreeNode root,int level,List<Integer> list){
        if(root==null) return;
        if(max<level){
            max=level;
            list.add(root.val);
        }
        level++;
        solve(root.right,level,list);
        solve(root.left,level,list);
    }
}