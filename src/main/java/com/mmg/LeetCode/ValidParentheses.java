package com.mmg.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
難度:EASY
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Example 1:              Example 2:              Example 3:
Input: "()"             Input: "()[]{}"         Input: "(]"
Output: true            Output: true            Output: false

Example 4:              Example 5:
Input: "([)]"           Input: "{[]}"
Output: false           Output: true
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        //先遇到{ 所以push "{" 的value->"}" 到stack
        //之後如果不是遇到KEY就看跟Stack的頂端是否一致(然後刪除頂端)，不一致就False
        //最後回傳stack是否為空
        for (char c : chars) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else {
                if (stack.isEmpty() || c!=stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}

