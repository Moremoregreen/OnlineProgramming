package com.mmg.LeetCode;

/*
難度:EASY
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
https://leetcode.com/problems/search-insert-position/
Example 1:                  Example 2:
Input: [1,3,5,6], 5         Input: [1,3,5,6], 2
Output: 2                   Output: 1
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target)
                return i;
        }
        return nums.length;
    }
}
