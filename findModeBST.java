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

// Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// Both the left and right subtrees must also be binary search trees.
// For example:
// Given BST [1,null,2,2],

// output   = [2]
    
class Solution {
    Integer prev =null;
    int count =1;
    int max=0;
    
    public int[] findMode(TreeNode root) {
        List<Integer> modes = new ArrayList<>();
        
         traverse(root, modes);
        
        int[] result = new int[modes.size()];
        for(int i=0; i< modes.size(); i++){
            result[i] = modes.get(i);
        }
        
        return result;
    }
    
    public void traverse(TreeNode node, List<Integer> modes){
     
        if(node == null) return;  
         traverse(node.left, modes);
           
         if(prev != null){
             if(prev == node.val){
                 count++; // if the nodes are duplicates then increament the count value.
             } else {
                 count =1; // reset count value if node values are not duplicate 
             }
         }
        
         if(count > max){
          max = count;
          modes.clear();
          modes.add(node.val);
         } else if(count == max){
           modes.add(node.val);
         }   
         
         prev = node.val;
        
         traverse(node.right, modes);
              
    }
        
}
