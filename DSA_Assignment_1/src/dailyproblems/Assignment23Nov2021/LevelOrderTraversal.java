package dailyproblems.Assignment23Nov2021;

import java.util.*;

public class LevelOrderTraversal {

	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
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
	
	public static void printKthLevel(Node node, int level) {
		if(node == null) {
			System.out.println("No node present.");
			return;
		}
		
		if(level == 0) {
			System.out.println("Node = " + node.data);
			return;
		}
		
		printKthLevel(node.left, level - 1);
		printKthLevel(node.right, level - 1);
	}
	
	public static void levelOrderTraversalRecursive(Node root) {
		int height = calculateHeight(root);
		
		for(int i = 0; i < height; i++) {
			printKthLevel(root, i);
		}
	}
	
	public static void levelOrderTraversalIterative(Node root) {
		if(root == null) {
			return;
		}
		
		// create an empty queue and enqueue the root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        // to store the current node
        Node curr;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // process each node in the queue and enqueue their
            // non-empty left and right child
            curr = queue.poll();
 
            System.out.print(curr.data + " ");
 
            if (curr.left != null) {
                queue.add(curr.left);
            }
 
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Level Order Traversal (Recursive): ");
		levelOrderTraversalRecursive(root);
		
		System.out.println("Level Order Traversal (Iterative): ");
		levelOrderTraversalIterative(root);
		
		

	}

}
