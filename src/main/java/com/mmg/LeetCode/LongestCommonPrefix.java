package com.mmg.LeetCode;

/*  難度:EASY
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefixBYVerticalscanning(strs));
    }

    public static String longestCommonPrefixBYVerticalscanning(String[] strs) {  //比較喜歡這方法
        if (strs == null || strs.length == 0) return "無公字首";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);        // f l o w e r
            for (int j = 0; j < strs.length; j++) {
                if (i ==strs[j].length() || strs[j].charAt(i) !=c) {
                    boolean a = i ==strs[j].length();
                    boolean b = strs[j].charAt(i) !=c;
                    System.out.println(a+"          " +b);
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "";
            }
        }
        return pre;
    }
}
