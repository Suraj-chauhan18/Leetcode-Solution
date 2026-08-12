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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> list=new ArrayList<>();
        
        if(root==null){
            return list;
        }
        q.offer(root);
        while(q.size()>0){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=1;i<=size;i++){
            TreeNode a=q.poll();
            level.add(a.val);
            if(a.left!=null) q.offer(a.left);
            if(a.right!=null) q.offer(a.right);
            }
            list.add(level);
        }
    return list;
    }
}