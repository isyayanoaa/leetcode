/*
94.二叉树的中序遍历
 */

package leetcode.Binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class inordertraversal {
    //这个是递归的方法
    public List<Integer> inorderTraveral(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    //这个方法是迭代方法，通过栈和循环的形式
    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
         while(root!=null||!stk.isEmpty()){
             while(root!=null){
                 stk.push(root);
                 root = root.left;
             }
             root = stk.pop();
             res.add(root.val);
             root = root.right;
         }
         return res;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2,node3,null);
        TreeNode root = new TreeNode(1,null,node2);
        List<Integer> res = new ArrayList<>();
        inordertraversal solution = new inordertraversal();
        res = solution.inorderTraveral(root);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
