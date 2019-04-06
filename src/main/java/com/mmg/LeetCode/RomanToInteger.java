package com.mmg.LeetCode;

import java.util.HashMap;

/*
難度:EASY
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
羅馬轉數字
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //從最右邊開始算，result = 5 ，I < V 所以5-1， C >I 所以再加100 以此類推到結束
        //5 -1 +100 -10 +1000 - 100 + 1000 = 1994
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
                result+=map.get(s.charAt(i));
            else
                result-=map.get(s.charAt(i));
        }
        return result;
    }
}
