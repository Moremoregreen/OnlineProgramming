package com.mmg.LeetCode;

/*
難度:EASY
 */

public class ImplementSTR {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStrByIndexof(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("") || needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() == 1 || checkRight(i, haystack, needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean checkRight(int index, String haystack, String needle) {
        for (int i = 1; i < needle.length(); i++) {
            if (haystack.charAt(i + index) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int strStrByIndexof(String haystack, String needle) {
        if (haystack.length() >= needle.length()) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
