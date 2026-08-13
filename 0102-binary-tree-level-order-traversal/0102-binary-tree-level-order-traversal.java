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
      Queue<TreeNode> q=new LinkedList<>();
      List<List<Integer>> list=new ArrayList<>();
      List<Integer> level=new ArrayList<>();
      if(root==null) return list;
      q.offer(root);
      q.offer(null);
      while(q.size()>0){
        TreeNode n=q.poll();
        level.add(n.val);
        if(n.left!=null) q.offer(n.left);
        if(n.right!=null) q.offer(n.right);
        if(q.peek()==null){
            list.add(new ArrayList<>(level));
            level.clear();
            q.remove();
            if(q.isEmpty()) break;
            q.offer(null);
            
        }

      }
     return list;
    }
}