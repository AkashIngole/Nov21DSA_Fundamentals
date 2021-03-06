package dailyproblems.Assignment24Nov2021;

public class LC235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) { return null; }
   if (root.val > p.val && root.val > q.val) {
     return lowestCommonAncestor(root.left, p, q);
   } else if (root.val < p.val && root.val < q.val) {
     return lowestCommonAncestor(root.right, p, q);
   } else {
     return root;
   }
   }
}
