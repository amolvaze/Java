// Code to find the max width of the given binary tree

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
    int maxWidth;
    HashMap<Integer,Integer> leftmost_positions;
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth=0;
        leftmost_positions = new HashMap();
        helper(root,0,0);
        return maxWidth;
    }
    
    public void helper(TreeNode root, int depth, int position){
      if(root == null) return;
      leftmost_positions.computeIfAbsent(depth, x->position);
      maxWidth = Math.max(maxWidth, position-leftmost_positions.get(depth)+1);
      helper(root.left,depth+1,position*2);
      helper(root.right,depth+1,position*2+1); 
    }
}
