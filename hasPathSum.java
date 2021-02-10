//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

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

// Input: root = [1,2,3], targetSum = 5
// Output: false
    
// Input: root = [1,2], targetSum = 0
// Output: false

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        Stack<TreeNode> node_stack = new Stack();
        Stack<Integer> sum_stack = new Stack();
        
        node_stack.push(root);
        sum_stack.push(targetSum-root.val);
        
        while(!node_stack.isEmpty()){
            TreeNode current_node = node_stack.pop();
            int current_sum = sum_stack.pop();
            
            if(current_node.left == null && current_node.right == null && current_sum ==0 ){
                return true;
            }
            
          if(current_node.left !=null){
              node_stack.push(current_node.left);
              sum_stack.push(current_sum-current_node.left.val);
          }  
            
             if(current_node.right !=null){
              node_stack.push(current_node.right);
              sum_stack.push(current_sum-current_node.right.val);
          } 
            
            
            
        }
        
        return false;
        
    }
}
