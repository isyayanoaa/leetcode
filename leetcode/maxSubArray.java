package leetcode;/*
53.最大子数组和
 */

public class maxSubArray {
    public int maxsubarray(int[] nums) {
        int res = 0, maxres = nums[0];
        for (int x : nums) {
            res = Math.max(res + x, x);
            maxres = Math.max(maxres, res);
        }
        return maxres;
    }

    public static void main(String[] args) {
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray solution = new maxSubArray();
        int res = solution.maxsubarray(test);
        System.out.print("连续子数组的最大和是：");
        System.out.print(res);
    }
}
