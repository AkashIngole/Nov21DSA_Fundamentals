package dailyproblems.Assignment23Nov2021;

import dailyproblems.Assignment23Nov2021.LevelOrderTraversal.Node;

public class LC112 {

	static class Node {
		int val;
		Node left;
		Node right;
		
		Node(int data) {
			this.val = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        
        if(targetSum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        }
           
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
