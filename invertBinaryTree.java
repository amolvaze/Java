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

// Time and space complexity - o(n) as recursion is used so there is stack due to which space complexity - O(n)

class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invertBinTree(root);
    }
    
    public TreeNode invertBinTree(TreeNode root)
    {
        if(root == null)
          return null;
        
        TreeNode leftInvert  = invertBinTree(root.left);
        TreeNode rightInvert = invertBinTree(root.right);
        
        root.right = leftInvert;
        root.left =  rightInvert;
        
        return root;
        
    }
}
