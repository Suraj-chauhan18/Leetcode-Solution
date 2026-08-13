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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Queue<TreeNode>q=new ArrayDeque<>();
       List<List<Integer>> list=new ArrayList<>();
       if(root==null) return list;
       q.add(root);
       //boolean direction=true;
       int c=0;
       while(q.size()>0){
        int size=q.size();
        List<Integer> level=new ArrayList<>();
        for(int i=1;i<=size;i++){
            TreeNode n=q.poll();
           // if(direction) level.addLast(n.val);
           // if(!direction) level.addFirst(n.val);
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
            level.add(n.val);
        }
        c++;
        if(c%2!=0){
            list.add(level);
        }else{
            Collections.reverse(level);
            list.add(level);
        }
       }
       return list;
    }
}