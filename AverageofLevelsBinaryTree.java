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

// Time Complexity - O(n)

  // BFS Approach

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
      
        List<Double> result = new ArrayList();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        
         while(!queue.isEmpty()){
            double level_Sum=0;
            int size = queue.size(); 
    // at each level like 1 for 3 root level, 2 for second level and so...
            // loop thru size
            for(int i=0; i< size; i++){
               TreeNode current_node = queue.poll();
               level_Sum +=current_node.val;
               if(current_node.left != null) queue.offer(current_node.left);
               if(current_node.right != null) queue.offer(current_node.right);
            }
            
          double level_Avg = level_Sum/size;
          result.add(level_Avg);
            
        }
        
     return  result;    
        
    }
}
