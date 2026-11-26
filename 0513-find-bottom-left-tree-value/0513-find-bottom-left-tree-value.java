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
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        solve(root,0,list);
        return list.get(list.size()-1);
    }
    void solve(TreeNode root,int level,List<Integer> list){
        if(root==null) return;
        if(max<level){
            max=level;
            list.add(root.val);
        }level++;
        solve(root.left,level,list);
        solve(root.right,level,list);
    }
}