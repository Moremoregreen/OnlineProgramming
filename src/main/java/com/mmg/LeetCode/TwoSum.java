package com.mmg.LeetCode;

//難度:EASY
//給1數字陣列與TARGET數字，求陣列哪兩個index相加為TARGET
/*
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int targetNum = 9;
        System.out.println(twoSum(nums, targetNum));
    }

    public static int[] twoSum(int[] nums, int target) {
        //int[] ansNums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
