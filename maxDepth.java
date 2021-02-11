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

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
         int max = Math.max(left, right) + 1;
          
        return max;
        
    }
}

// Using BFS - Queue Approach

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

  public int maxDepth(Node root) {
    
        if(root == null) return 0;
        
         int depth=0;
         
         Queue<Node> queue = new LinkedList();
            queue.offer(root);
            
            while(!queue.isEmpty()){
              int size = queue.size();
                for(int i=0; i< size; i++){
                Node current_node = queue.poll();
                 for(Node child: current_node.children) {
                     queue.offer(child);
                 }
                }
                
                depth++;
            }
        
         return depth;
        
        
    }
