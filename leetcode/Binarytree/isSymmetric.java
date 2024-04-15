/*
101.对称二叉树
 */
package leetcode.Binarytree;

public class isSymmetric {
    public boolean isSymmetric1(TreeNode root){
        if(root == null) return true;
        return dfs(root.left,root.right);
    }
    boolean dfs(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        isSymmetric solution = new isSymmetric();
        boolean res = solution.isSymmetric1(root);
        System.out.println(res);
    }
}
