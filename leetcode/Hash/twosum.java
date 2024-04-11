/*
1.两数之和
 */

package leetcode.Hash;

import java.util.HashMap;

public class twosum {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hashtable = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] test = new int[]{2,7,11,5};
        int target = 13;
        twosum solution = new twosum();
        int[] res = solution.twoSum(test,target);
        for(int x : res){
            System.out.print(x+" ");
        }
    }
}
