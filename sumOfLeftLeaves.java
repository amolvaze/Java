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
    public int sumOfLeftLeaves(TreeNode root) {
      if(root == null) return 0;
      
      int sum_left_leaves =0;
        
      if(root.left !=null){
          if(root.left.left == null && root.left.right == null){
              sum_left_leaves += root.left.val;
          } else {
             sum_left_leaves += sumOfLeftLeaves(root.left);
          }
      }  
        
      if(root.right != null){
          if(root.right.left != null || root.right.right != null){
              sum_left_leaves += sumOfLeftLeaves(root.right);
              
          }
      }  
        
      return sum_left_leaves;   
    }
}

// Iternative Solution using Stack data structure

public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    int ans = 0;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    
    while(!stack.empty()) {
        TreeNode node = stack.pop();
        if(node.left != null) {
            if (node.left.left == null && node.left.right == null)
                ans += node.left.val;
            else
                stack.push(node.left);
        }
        if(node.right != null) {
            if (node.right.left != null || node.right.right != null)
                stack.push(node.right);
        }
    }
    return ans;
}


