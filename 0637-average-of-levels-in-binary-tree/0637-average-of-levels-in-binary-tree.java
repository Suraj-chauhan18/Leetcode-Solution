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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        List<Double> list=new ArrayList<>();
        if(root==null) return list;
        q.offer(root);
        while(q.size()>0){
            int size=q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                sum+=n.val;
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
    
           list.add(sum/size);
        }
        return list;
    }
}