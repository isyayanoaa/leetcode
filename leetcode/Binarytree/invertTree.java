/*
226.翻转二叉树
 */
package leetcode.Binarytree;

import java.util.ArrayList;
import java.util.List;

public class invertTree {
    public TreeNode invertTree1(TreeNode root){
        if(root==null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree1(root.left);
        invertTree1(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(2,node1,node2);
        TreeNode node6 = new TreeNode(7,node3,node4);
        TreeNode root = new TreeNode(4,node5,node6);
        invertTree solution = new invertTree();
        TreeNode res = solution.invertTree1(root);
        List<Integer> res1 = new ArrayList<>();
        inordertraversal solution1 = new inordertraversal();
        res1 = solution1.inorderTraveral(res);
        for(int x: res1){
            System.out.print(x+" ");
        }
    }


}
