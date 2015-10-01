
public class BST {
	private BSTNode rootNode;
	
	//constructor
	public BST() {
		rootNode = null;
	}
	
	//check if empty, either true or false
	public boolean isTreeEmpty() {
		return rootNode == null;
	}
	
	//insert data to nodes
	public void insert(int data) {
		rootNode = insert(rootNode, data);
	}
	
	//insert recursively
	public BSTNode insert(BSTNode node, int data) {
		
		if (node == null) {
			node = new BSTNode(data);
		}
		else {
			if (data <= node.getData()) {
				node.left = insert(node.left, data);
			}
			else {
				node.right = insert(node.right, data);
			}
		}
		
		return node;
		
	}
	
	
	//delete nodes
	public void delete(int n) {
		if (isTreeEmpty()) {
			System.out.println("Tree is empty");
			
		}
		else if (search(n) == false) {
			System.out.println("Could not find node" + n);
			
		}
		else {
			rootNode = delete(rootNode, n);
			System.out.println("Node " + n + " has been removed.");
			
		}
	}

	//delete recursively
	public BSTNode delete(BSTNode rootNode, int k) {
		BSTNode temp1, temp2, x;
		
		if (rootNode.getData() == k) {
			BSTNode lNode, rNode;
			lNode = rootNode.getLeftNode();
			rNode = rootNode.getRightNode();
			if (lNode == null && rNode == null) {
				return null;
			}
			else if (lNode == null) {
				temp1 = rNode;
				return temp1;
			}
			else if (rNode == null) {
				temp1 = lNode;
				return temp1;
			}
			else {
				temp2 = rNode;
				temp1 = lNode;
				while (temp1.getLeftNode() != null) {
					temp1 = temp1.getLeftNode();
				}
				temp1.setLeftNode(lNode);
				return temp2;
				
			}
		}
		
		if (k < rootNode.getData()) {
			x = delete(rootNode.getLeftNode(), k);
			rootNode.setLeftNode(x);
		}
		else {
			x = delete(rootNode.getLeftNode(), k);
			
		}
		return rootNode;
		
	}
	
	public int countNodes() {
		return countNodes(rootNode);
	}
	
	public int countNodes(BSTNode rt) {
		if (rt == null) {
			return 0;
		}
		else {
			int count = 1;
			count += countNodes(rt.getLeftNode());
			count += countNodes(rt.getRightNode());
			return count;
		}
	}
	
	//method for search
	public boolean search(int value) {
		return search(rootNode, value);
	}
	
	//recursive search
	public boolean search(BSTNode rt, int val) {
		boolean found = false;
		while ((rt != null) && !found) {
			int rval = rt.getData();
			if (val < rval) {
				rt = rt.getLeftNode();
			}
			else if (val > rval) {
				rt = rt.getRightNode();
			}
			else {
				found = true;
				break;
			}
			
			found = search(rt, val);
		}
		return found;
	}
	
	public void inorder() {
		inorder(rootNode);
	}
	
	public void  inorder(BSTNode rt) {
		if (rt != null) {
			inorder(rt.getLeftNode());
			System.out.println(rt.getData() + " ");
			inorder(rt.getRightNode());
			
		}
	}
	
}
