package Tree;

class BST_evaluation { 	
	class Node { 
		int key; 
		Node left, right; 

		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 

	// Root of BST 
	Node root; 
	public BST_evaluation() {
		root = null; 
	} 

	// This method mainly calls insertRec() 
	//1-insert
	void insert(int key) { 
	root = insertRec(root, key); 
	} 
	
	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) { 

		/* If the tree is empty, return a new node */
		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 

		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 
		return root; 
	} 
	
	/* A iterative function to insert a new key in BST */
		Node insert_iter(Node root,int x)
		{
			Node temp=new Node(x);
			Node parent=null,curr=root;
			while(curr!=null)
			{
				parent=curr;
				if(curr.key  > x)
					curr=curr.left;
				else if(curr.key < x)
					curr= curr.right;
				else
					return root;
			}
			
			if(parent == null)
				return temp;
			if(parent.key  > x)
				parent.left=temp;
			else
				parent.right=temp;
			return root;
		}
			
		/* A function that return a boolean value if key exist */
		//	2-search
		boolean search(int key)
		{
			return search_rec(root,key);
		}
	boolean search_rec(Node root, int x)
	{
		if(root == null)
			return false;
		else if (root.key ==  x)
			return true;
		else if(root.key > x)
			return search_rec(root.left,x);
		else
			return search_rec(root.right, x);
	}
	
	/* A recursive function that return a boolean value if key exist */
	boolean search_iter(Node root,int x)
	{
		while(root!=null)
		{
			if(root.key == x)
				return true;
			else if(root.key  < x)
				root = root.right;
			else
				root = root.left;
		}
		return false;
	}
	
	//3-delete node
	//it return deleted value
	
	void del(int key)
	{
		root=delNode(root,key);
	}
	
	Node delNode(Node root,int x)
	{
		if(root==null)
			return null;
		if(root.key >  x)
			root.left=delNode(root.left, x);
		else if(root.key  < x)
			root.right=delNode(root.right, x);
		else {
			if(root.left ==null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
				Node succ=getSucc(root);
				root.key=succ.key;
				root.right=delNode(root.right, succ.key);	
			}
			
		}
		return root;
	}

	 Node getSucc(Node root) {
		Node curr=root.left;
		while(curr!=null && curr.left!=null)
			curr=curr.left;
		return curr;
	}


	// This method print the node in inorder method
	 //4-display
	void display() { 
	inorderRec(root); 
	System.out.println();
	} 

	// A utility function to print the tree in inorder traversal
	
	void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left); 
			System.out.print(root.key+" "); 
			inorderRec(root.right); 
		}
	
	} 

	// Driver Program to test above functions 
	public static void main(String[] args) { 
		BST_evaluation tree = new BST_evaluation(); 

		tree.insert(50); 
		tree.insert(30); 
		tree.insert(20); 
		tree.insert(40); 
		tree.insert(70); 
		tree.insert(60); 
		tree.insert(80); 
		tree.display(); 
		tree.del(20);
		tree.display();
		System.out.println(	tree.search(40));
	} 
} 