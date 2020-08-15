import java.util.*;

// Code for binary tree pruning 

// Time and Space Complexity - O(n)

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
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }
    
    public boolean containsOne(TreeNode node)
    {
        if(node == null) return false;
        boolean left_contains = containsOne(node.left);
        boolean right_contains = containsOne(node.right);
        
        if(!left_contains)
         node.left= null;
           
        
        if(!right_contains)
        node.right = null;
        
        return node.val == 1 || left_contains || right_contains; 
        
    }
}
