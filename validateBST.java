
 //Definition for a binary tree node.
  // public class TreeNode {
  //     int val;
  //    TreeNode left;
  //    TreeNode right;
  //    TreeNode() {}
  //    TreeNode(int val) { this.val = val; }
  //    TreeNode(int val, TreeNode left, TreeNode right) {
  //    this.val = val;
  //        this.left = left;
  //       this.right = right;
  //    }
  // }

class Solution {
    public boolean isValidBST(TreeNode root) {
      
      Stack<TreeNode> stack = new Stack();
      double left_child_val = -Double.MAX_VALUE;
      while(!stack.isEmpty() || root!= null) {
          while(root!= null) {
              stack.push(root);
              root = root.left;
          }
          
             root = stack.pop();
             if(root.val <= left_child_val) return false;
              left_child_val = root.val;
              root = root.right;
                    
      }
        
       return true; 
    }
}
// --------------------------------------------------------------Another approach-------------------------------------------------------------------------------
 
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
 
  public boolean isValidBST(TreeNode root) {
       
        return helper(root, null, null);
    }
    
    public boolean helper(TreeNode root, Integer min, Integer max)
    {
         if(root == null) 
            return true;
      if((min!= null && root.val <= min) || (max!=null && root.val >= max) )
          return false;
        
     return helper(root.left, min, root.val) && helper(root.right, root.val, max);
          
    }
