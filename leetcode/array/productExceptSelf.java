/*
238.除自身以外数组的乘积
 */
package leetcode.array;

public class productExceptSelf {
    public int[] productexceptself(int[] nums){
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];
        int[] answer = new int[length];
        L[0] = 1;
        for(int i=1;i<length;++i){
            L[i]=L[i-1]*nums[i-1];
        }
        R[length-1]=1;
        for(int i=length-2;i>=0;i--){
            R[i]=R[i+1]*nums[i+1];
        }
        for(int i=0;i<length;i++){
            answer[i]=L[i]*R[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        productExceptSelf solution = new productExceptSelf();
        int[] res = solution.productexceptself(nums);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
