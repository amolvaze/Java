import java.util.*;

 // Definition for a binary tree node.
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
 

// Code to find the bottom left tree value using a queue.

class Main {
 
  public static int findBottomLeftValue(TreeNode root) {
   Queue<TreeNode> queue = new LinkedList<>();
   queue.offer(root);
   while(!queue.isEmpty())
   {
      root = queue.poll();
      if(root.right!=null)
      {
        queue.offer(root.right);
      }
      if(root.left!=null)
      {
        queue.offer(root.left);
      }
   } 
  
  return root.val;
      
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}