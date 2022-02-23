package binary_tree;
import java.util.*;
class Traversal_Pre_In_Post {
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
    class Pair{
        int stat;
        TreeNode node;
        Pair(int stat,TreeNode node){
            this.stat = stat;
            this.node = node;
        }
    }
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> items = new ArrayList<Integer>();
        if(root == null)
            return items;
        
        LinkedList<Pair> stack = new LinkedList<Pair>();
        Pair rootP = new Pair(0,root);
        stack.addFirst(rootP);
        
        while(stack.size()>0){
            Pair p = stack.getFirst();
            if(p.stat == 0){
                if(p.node.left != null){
                    Pair lp = new Pair(0,p.node.left);
                    stack.addFirst(lp);
                }
                p.stat++;    
            }
            else if (p.stat == 1){
                if(p.node.right != null){
                    Pair rp = new Pair(0,p.node.right);
                    stack.addFirst(rp);
                }
                p.stat++;
            }else{
                items.add(p.node.val);
                stack.removeFirst();
            }
        }
        
        return items;
    }
    public List<Integer> postorderTraversal2(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                result.addFirst(p.val);  // Reverse the process of preorder
                p = p.right;             // Reverse the process of preorder
            } else {
                TreeNode node = stack.pop();
                p = node.left;           // Reverse the process of preorder
            }
        }
        
        return result;
    }

    public List<Integer> preOrderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(root == null) return res;

        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null){
                stack.addFirst(p);
                res.add(p.val);
                p = p.left;
            }
            else{
                TreeNode node = stack.removeFirst();
                p = node.right;
            }
        }
        return res;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);  // Add after all left children
                p = node.right;   
            }
        }
        return result;
    }
}