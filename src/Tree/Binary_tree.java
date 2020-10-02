package Tree;

class Node {
	int key;
	Node left;
	Node right;

	Node(int k) {
		key = k;
		left=right=null;
	}
}

public class Binary_tree {
	
	public static Node tree;
	
	public Binary_tree() {
		tree=null;
	}

	void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	
	}

	void preorder(Node root) {
		if(root==null) 
			return;
		System.out.print(root.key + " ");
		preorder(root.left);
		preorder(root.right);
	
	}

	void postorder(Node root) {
		if(root==null) 
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " ");
		
	}

	int getsize(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + getsize(root.left) + getsize(root.right);

	}

	int getmax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		else
			return Math.max(root.key, Math.max(getmax(root.left), getmax(root.right)));

	}

	int height(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(height(root.left), height(root.right)) + 1;
	}
 
	

public static void main(String[] args) {
	Binary_tree b=new Binary_tree();
	Binary_tree.tree=new Node(1);
	Binary_tree.tree.left = new Node(2); 
    Binary_tree.tree.right = new Node(3); 
    Binary_tree.tree.left.left = new Node(4); 
    Binary_tree.tree.left.right = new Node(5); 
	System.out.println("Inorder is: ");
	b.inorder(tree);
	System.out.println("\nPreorder is: ");
	b.preorder(tree);	
	System.out.println("\nPostorder is: ");
    b.postorder(tree);
    
	System.out.println("\nMaximum element in the tree is: "+b.getmax(tree));
	System.out.println("\nHeight of the tree is: "+b.height(tree));
}
}