// To convert sorted array to BST.

// Recusrive solution


class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;        
        return build(nums, 0, nums.length - 1);
    }
    
    private static TreeNode build(int[] vals, int lo, int hi) {
        if (lo > hi) return null; 
        var mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(vals[mid]);
        root.left = build(vals, lo, mid - 1);
        root.right = build(vals, mid + 1, hi);
        return root;
    }
}
