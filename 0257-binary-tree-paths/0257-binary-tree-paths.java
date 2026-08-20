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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> path=new ArrayList<>();
       List<Integer> ans=new ArrayList<>();
       paths(root,path,ans);
       return path;
    }
    public void paths(TreeNode root,List<String>path,List<Integer>ans){
          if(root==null) return;
          ans.add(root.val);
          if(root.left==null && root.right==null){
            String s="";
            for(int i=0;i<ans.size();i++){
                s+=ans.get(i);
                if(i!=ans.size()-1){
                    s+="->";
                }
                
            }
            path.add(s);
          }
          paths(root.left,path,ans);
          paths(root.right,path,ans);
          ans.remove(ans.size()-1);
    }
}