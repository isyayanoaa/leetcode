/*
543.二叉树的直径
 */
package leetcode.Binarytree;

public class diameterOfBinaryTree {
    private int res;
    public int diameterOfBinaryTree1(TreeNode root) {
        maxdepth(root);
        return res;
    }
    public int maxdepth(TreeNode root){
        if(root == null) return 0;
        int leftdepth = maxdepth(root.left);
        int rightdepth = maxdepth(root.right);
        res = Math.max(res,leftdepth + rightdepth);
        return Math.max(leftdepth,rightdepth)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        diameterOfBinaryTree solution = new diameterOfBinaryTree();
        int diameter = solution.diameterOfBinaryTree1(root);
        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}
