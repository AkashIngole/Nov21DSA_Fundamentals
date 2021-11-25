package dailyproblems.codeSharedByEducators;

//https://www.geeksforgeeks.org/binary-tree-array-implementation/

/* Class containing left and right child of current
node and key value*/
class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
public class BinaryTree
{

	static int levelSoFar=0;
	
	public static void preorder(Node root) {
		if(root==null) return;
		
		System.out.print(root.key+",");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.print(root.key+",");
		inorder(root.right);
		
	}
	
	public static void postOrder(Node root) {
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+",");
		
	}
		
	static int getHeight(Node node)
    {
        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = getHeight(node.left);
            int rDepth = getHeight(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }

	static int get_count(Node root){
	    if(root==null){
	        return 0;
	    }
	    else{
	        return 1+ get_count(root.left)+ get_count(root.right);
	    }
	}
		
	//Printing the left view nodes only.
	static void leftView(Node root, int currlevel) {
		if(root == null) return ;
		
		if(currlevel >= levelSoFar) {
			//reached a new level 
			System.out.println(root.key);
			levelSoFar++; //indicates that i have visited this level
		}
		
		leftView(root.left,currlevel+1);
		leftView(root.right,currlevel+1);
	}
	
	static void rightView(Node root, int currlevel) {
		if(root == null) return ;
		
		if(currlevel >= levelSoFar) {
			//reached a new level 
			System.out.println(root.key);
			levelSoFar++; //indicates that i have visited this level
		}
		
		rightView(root.right,currlevel+1);
		rightView(root.left,currlevel+1);
	}
	
	//Try for rightView
	
	
	
	//level order traversal : Iterative way.
	//https://www.geeksforgeeks.org/level-order-tree-traversal/
	
	
	//Print the kth Level only.
	static void PrintKthLevel(Node root, int k) {
		if(root==null) return;
		
		if(k==0) {
			System.out.print(root.key+" ");
		}
		PrintKthLevel(root.left, k-1);
		PrintKthLevel(root.right, k-1);
	}
	
	
	//level order traversal : Recursive way
	static void levelTraversal(Node root) {
		int h = getHeight(root);
		
		for(int i=0;i<=h;i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args)
	{
		Node root = new Node(1);

		/*create root*/
//		 root = new Node(1);

		/* following is the tree after above statement

			 1
			/ \
		null null	 */

		root.left = new Node(2);
		root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
		   1
		 /	 \
		2	 3
		/ \	 / \
	null null null null */


		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		/* 4 becomes left child of 2
				  1
				/	 \
			 2		  3
			/ \	    /   \
			4  5   null  6
		   / \
		 null null
		 
		*/
		
//		PrintKthLevel(root, 2);
//		levelTraversal(root);
		
		rightView(root,0);
//		preorder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.println();
//		inorder(root);
		
//		System.out.println(maxDepth(root));
//		System.out.println(get_count(root));
		
		
	}
}
