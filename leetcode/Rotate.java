/*
183.轮转数组
System.arraycopy的用法:(源数组,从哪里开始复制,目的数组,从哪里开始粘贴,复制几个元素)
 */

package leetcode;

public class Rotate {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void rotate1(int[] nums,int k){
        int length = nums.length;
        int[] temp = new int[length];
        for(int i=0;i<nums.length;++i){
            temp[(i+k)%nums.length] = nums[i];
        }
        System.arraycopy(temp,0,nums,0,length);
    }
    public void reverse(int[] nums,int begin,int end) {
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        Rotate solution = new Rotate();
        solution.rotate(test,k);
        for(int i=0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }

}
