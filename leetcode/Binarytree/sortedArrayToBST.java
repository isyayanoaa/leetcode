package leetcode.Binarytree;

import java.util.List;

public class sortedArrayToBST {
    public TreeNode sortedArrayToBST1(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }
    public TreeNode dfs(int[] nums,int left,int right){
        if(left>right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,left,mid-1);
        root.right = dfs(nums,mid+1,right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        sortedArrayToBST solution = new sortedArrayToBST();
        TreeNode root = solution.sortedArrayToBST1(nums);
        levelOrder test = new levelOrder();
        List<List<Integer>> res = test.levelOrder1(root);
        for(List ans: res){
            for(Object val: ans){
                System.out.println(val);

            }        }

    }
}
