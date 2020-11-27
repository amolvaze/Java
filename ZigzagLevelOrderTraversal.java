//Binary Tree Zigzag Level Order Traversal

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
 
/* For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]

 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result  = new ArrayList();
        traverse(result, 0, root);
        return result;
    }
    
    private void traverse(List<List<Integer>> res, int level, TreeNode root){
          if(root == null) return;
           if(res.size() <= level){
              res.add(new ArrayList<Integer>());
           }
        if(level%2 == 0){
            res.get(level).add(root.val);
        }
        else {
           res.get(level).add(0, root.val);
        }
        
       traverse(res, level + 1, root.left);
       traverse(res, level + 1, root.right);
         
    }
    
}
