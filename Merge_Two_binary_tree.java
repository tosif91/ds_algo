public class Merge_Two_binary_tree {
 
 
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null)
            return root2;
        else if (root2 == null)
            return root1;
      
        TreeNode left = null,right = null;
      
        left= mergeTrees(root1.left,root2.left);
        
        right = mergeTrees(root1.right,root2.right);
        
        root1.val += root2.val;
        root1.left = left;
        root1.right = right;
        return root1;
    }   
}
