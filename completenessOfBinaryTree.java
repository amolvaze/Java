import java.util.*;
// Code to check completeness of binary tree.
// Time and space complexity - O(n)
 // Definition for a binary tree node.

//When level-order traversal in a complete tree, after the last node, all nodes in the queue should be null.
//Otherwise, the tree is not complete.  

static class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
 }
 
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        boolean end = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode current = queue.poll();
            if(current == null)
            {
                end = true;
            }
            else
            {
                if(end) return false;
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
    return true;
    }
}
