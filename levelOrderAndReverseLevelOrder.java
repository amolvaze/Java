// level order traversal & reverse level Order Traversal

static class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right =null;
	}
}
class Main {
  public static void levelOrderQueue(Node root){
   Queue q = new LinkedList();
   int levelNodes =0;
   if(root == null)
    return;
   q.offer(root);
   while(!q.isEmpty()){
     levelNodes = q.size();
      Node n = (Node) q.remove();
      System.out.println(n.data+" ");
      if(n.left!=null) q.add(n.left);
      if(n.right!=null) q.add(n.right);
      levelNodes--;
   }

   System.out.println("");


  }
 // Reverse Level Order traversal
  public void reverseBFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);// add the root node to the queue
		while (!q.isEmpty()) {
			// add the children to the queue
			Node n = q.remove();
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
			// add the extracted node to the Stack
			s.add(n);
		}
		// now print all the Node in Stack
		while (s.isEmpty() == false) {
			System.out.print(s.pop().data + " ");
		}
	}


  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
