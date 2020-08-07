import java.util.*;

// code to merge two binary trees.
// Time Complexity - O(n)
// Space Complexity - O(n) - due to recursion and stack.

  //Definition for a binary tree node.
  public class TreeNode {
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
 


class Main {
  public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }
 public static TreeNode merge(TreeNode t1, TreeNode t2)
 {
     if(t1 == null && t2 == null)
      return null;
     
     if(t1!= null && t2 == null)
     return t1;

     if(t1==null && t2!=null)
     return t2;
     
     TreeNode sum = new TreeNode(t1.val + t2.val);
     sum.left = merge(t1.left, t2.left);
     sume.right = merge(t1.right, t2.right);

     return sum;
 }
  
  public static void main(String[] args) {

    // we will create tree and invoke method.
    System.out.println("Hello world!");
  }
}
