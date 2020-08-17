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

/*
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
  
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
*/
// REcursive Solution

class Solution {
    int range_sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
       range_sum=0;
        get_range_sum(root,L,R);
        return range_sum;
    }
    
    public void get_range_sum(TreeNode root, int L, int R)
    {
        if(root!=null)
        {
            if(root.val >=L && root.val <=R)
            {
                range_sum += root.val;
            }
            
            if(root.val > L)
            {
                get_range_sum(root.left, L, R);
            }
            
            if(root.val < R)
            {
                get_range_sum(root.right, L, R);
            }
            
        }
    }
}

//-----------------------------------------Iterative Approach Using a Stack-----------------------------------------------------------------------------------------------
class Solution {
   // Iterative Solution using a Stack
    public int rangeSumBST(TreeNode root, int L, int R) {
      int range_sum=0;
     Stack<TreeNode> stack = new Stack();
     stack.push(root);
    
       while(!stack.isEmpty())
       {
           TreeNode node = stack.pop();
          if(node.val >=L && node.val <=R)
          {
              range_sum += node.val;
          }
           
         if(node.val > L && node.left !=null)
         {
             stack.push(node.left);
         }
           
         if(node.val < R && node.right !=null)
         {
             stack.push(node.right);
         }
           
           
       }
        
    return range_sum;
    
    }
    
}
