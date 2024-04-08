/*
283.移动零
 */

package leetcode;

public class moveZeros {
    public int[] movezeros(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        for(;j<nums.length;++j){
            nums[j]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] test = new int[]{0,1,0,3,12};
        moveZeros solution = new moveZeros();
        int[] res = solution.movezeros(test);
        System.out.println("结果为:");
        for(int x : res){
            System.out.print(","+x);
        }
    }
}
