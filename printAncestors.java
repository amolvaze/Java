import java.util.*;
// Code to print ancestors of given node 

// Time Complexity - O(n)

class Node {
  int data;
  Node left, right, nextRight;
  Node(int item) {
    data = item;
    left= right= nextRight = null;
  }
}

class Main {
  Node root;
  public boolean printAncestors(Node node, int target)  {
     if(node == null) {
       return false;
     }
     if(node.data == target) {
       return true;
     }
     if(printAncestors(node.left, target) || printAncestors(node.right, target)) {
      System.out.println(node.data+" ");
      return true;
     }

     return false;
  }

  public static void main(String[] args) {
    Main tree = new Main(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.left.left = new Node(7); 
   
        tree.printAncestors(tree.root, 7); 
   
  }
}

/* Construct the following binary tree  
                1  
                / \  
            2     3  
            / \  
            4 5  
            /  
        7  
        */
