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
    List<List<Integer>> ans;   //Global Variable

    public List<List<Integer>> levelOrder(TreeNode root) {
        ans=new ArrayList<>();
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode root, int len){
        if(root==null) return;

        if(ans.size()==len){
            ans.add(new ArrayList<>());
        }
        ans.get(len).add(root.val);

        dfs(root.left,len+1);
        dfs(root.right,len+1);
        
    }
}