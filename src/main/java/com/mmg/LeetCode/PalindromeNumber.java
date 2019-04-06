package com.mmg.LeetCode;

/*
難度:EASY
給1 int 從左到右與右到左一樣的話回傳true，否則false
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 10000211;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int length = num.length();
        if (x < 0) return false;
        if (x < 10) return true;
        for (int i = 0; i < length / 2; i++) {
            if (num.charAt(i) != num.charAt(length - 1 - i))
            return false;
        }
        return true;
    }
}
