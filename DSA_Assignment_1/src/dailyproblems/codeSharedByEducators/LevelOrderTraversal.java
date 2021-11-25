package dailyproblems.codeSharedByEducators;


import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class Node1 {
	int data;
	Node1 left;
	Node1 right;

	public Node1(int item)
	{
		data = item;
		left = null;
		right = null;
	}
}

/* Class to print Level Order Traversal */
public class LevelOrderTraversal {



	/* Given a binary tree. Print
	its nodes in level order
	using array for implementing queue */
	static void printLevelOrder(Node1 root)
	{
		Queue<Node1> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			
			
			Node1 tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			/*Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/*Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public static void main(String args[])
	{
		/* creating a binary tree and entering
		the nodes */
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);

		System.out.println("Level order traversal of binary tree is - ");
		printLevelOrder(root);
	}
}
