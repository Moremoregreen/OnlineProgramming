package com.mmg.LeetCode;


/*
難度:EASY
給一陣列與要消除的val值
https://leetcode.com/problems/remove-element/submissions/
return移除後的大小，且他會陣列檢查大小內是否有val
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int val = 2;
        System.out.println(removeElement(num, val));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            //num[i++] = 從頭開始放非val的值
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        System.out.println(nums.length);
        return i;
    }

}
