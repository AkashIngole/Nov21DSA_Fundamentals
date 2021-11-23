package dailyproblems.Assignment22Nov2021;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
public class BinaryTreeIntro {
	
	public static void preOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.data + " - ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public static void inOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		inOrderTraversal(node.left);
		System.out.print(node.data + " - ");
		inOrderTraversal(node.right);
	}
	
	public static void postOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + " - ");
	}

	public static int calculateHeight(Node node) {
		if(node == null) {
			return 0;
		}
		
		int heightLeftSubtree = calculateHeight(node.left);
		int heightRightSubtree = calculateHeight(node.right);
		
		if(heightLeftSubtree > heightRightSubtree) {
			return heightLeftSubtree + 1;
		} else  {
			return heightRightSubtree + 1;
		}
	}
	
	public static int countNodesInBinaryTree(Node node) {
		if(node == null) {
			return 0;
		}
		
		return 1 + countNodesInBinaryTree(node.left) + countNodesInBinaryTree(node.right);
	}
	
	public static void printLeafNodes(Node node) {
		if(node == null) {
			return;
		} else if (node.left == null && node.right == null) {
			System.out.println(node.data);
		} else {
			printLeafNodes(node.left);
			printLeafNodes(node.right);
		}
	}
	 
	public static int sumOfAllNodes(Node node) {
		if(node == null) {
			return 0;
		}
		
		return node.data + sumOfAllNodes(node.left) + sumOfAllNodes(node.right);
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("\nPre-Order Traversal:");
		preOrderTraversal(root);
		
		System.out.println("\nIn-Order Traversal:");
		inOrderTraversal(root);
		
		System.out.println("\nPost-Order Traversal:");
		postOrderTraversal(root);
		
		System.out.println("\n\n Height of Binary Tree is: " + calculateHeight(root));
		
		System.out.println("\nTotal number of nodes in tree are " + countNodesInBinaryTree(root));
		
		System.out.println("\n Printing leaf nodes of tree:");
		printLeafNodes(root);
		
		System.out.println("\n Sum of all nodes is: " + sumOfAllNodes(root));
	}

}
