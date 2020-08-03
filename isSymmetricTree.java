import java.util.*;

// code to return symmetric tree or check if two trees are mirror of each others.
// Time complexity - O(n) and space complexity - O(n) due to recursion stack - O(n) - space complexity.

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

class Main {

 public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode root1, TreeNode root2)
    {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        
        return (root1.val == root2.val) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
