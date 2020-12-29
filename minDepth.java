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

// BFS - level order traversal approach - Time Complexity and Space Complexity - O(n)
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode rightMost = root;
        int depth = 1;
        while (!q.isEmpty()) {
        TreeNode node = q.poll();
        if (node.left == null && node.right == null) break;
        if (node.left != null) q.add(node.left);
        if (node.right != null) q.add(node.right);
        if (node == rightMost) {
        depth++;
        rightMost = (node.right != null) ? node.right : node.left;
        }
        }
        return depth;
        }
}

// Approach -2 - DFS recursive approach - Time Complexity- O(n) and Space Complexity - O(log n)

public int minDepth(TreeNode root) {
if (root == null) return 0;
if (root.left == null) return minDepth(root.right) + 1;
if (root.right == null) return minDepth(root.left) + 1;
return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
}
