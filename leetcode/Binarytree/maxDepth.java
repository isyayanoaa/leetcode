/*
226.二叉树的最大深度
 */
package leetcode.Binarytree;

import java.util.LinkedList;
import java.util.List;

public class maxDepth {
    //采用DFS
    public int maxDepth1(TreeNode root){
        if (root==null) return 0;
        return Math.max(maxDepth1(root.left),maxDepth1(root.right))+1;
    }
    public int maxdepth2(TreeNode root){
        if (root==null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>() {{add(root);}},tmp;
        int res = 0;
        while(!queue.isEmpty()){
            tmp = new LinkedList<TreeNode>();
            for(TreeNode node : queue){
                if(node.left!=null) tmp.add(node.left);
                if(node.right!=null) tmp.add(node.right);
            }
            res++;
            queue = tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(15);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20,node1,node2);
        TreeNode node4 = new TreeNode(9);
        TreeNode root = new TreeNode(3,node4,node3);
        maxDepth solution = new maxDepth();
        int res = solution.maxDepth1(root);
        System.out.print("此树的深度为:"+res);

    }
}
