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

// Time Complexity - O(N)

class Solution {
    public List<Integer> postorder(Node root) {
        
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList();
        
        if(root == null)
            return output;
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for(Node child  : node.children){
                stack.add(child);
            }
            
        }
        
        return output;
        
    }
}

// -------------------------------JavaScript Solution -------------------------------------------------------------------------

/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node} root
 * @return {number[]}
 */
var postorder = function(root) {
    let stack = [];
    stack.push(root);
    let arr = [];
    while(stack.length>0){
        let node = stack.pop();
        if(node){
            stack.push(...node.children);
            arr.unshift(node.val);
        }
    }
    return arr;
};

