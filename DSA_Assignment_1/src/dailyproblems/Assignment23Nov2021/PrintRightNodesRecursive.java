package dailyproblems.Assignment23Nov2021;

import dailyproblems.Assignment23Nov2021.PrintKthLevelNodesBinaryTree.Node;

public class PrintRightNodesRecursive {
	static int levelSoFar;
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
	
	static void rightView(Node root, int currlevel) {
		if(root == null) return ;
		
		if(currlevel >= levelSoFar) {
			//reached a new level 
			System.out.println(root.data);
			levelSoFar++; //indicates that i have visited this level
		}
		
		rightView(root.right,currlevel+1);
		rightView(root.left,currlevel+1);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		rightView(root, 0);

	}

}
