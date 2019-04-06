package com.mmg.codewars;

import java.util.*;
import java.util.stream.Collectors;

/*
給一個字串，輸出幾個字有重複的(大小寫不分如aA就算重複)
Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
*/
public class CountingDuplicates {
    public static void main(String[] args) {
        String str = "abcdea";
        String str2 = "adcdea";
        int result = count("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix");
        System.out.println(result);
    }
    public static int duplicateCountByMaster(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }
    public static int duplicateCountByMaster2(String text) {
        Set<String> count = new HashSet<>();

        for (String string : text.toLowerCase().split("")) {
            if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
        }

        return count.size();
    }

    public static int duplicateCountByMaster3(String text) {
        return (int)text.toLowerCase().chars().boxed().collect(
                Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
    }

    private static int count(String str) {
        str = str.toUpperCase();
        char[] chs = str.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        int count = 0;
        //lamda countMap.merge(s, 1, (a, b) -> a + b);
        for (char s : chs) {
            Integer value = countMap.get(s);
            if (value == null) {
                countMap.put(s,1);
            } else {
               countMap.put(s,value+1);
            }
        }
        for (Object key : countMap.keySet()) {
            if(countMap.get(key)>1){
                count++;
            }
        }
        return count;
    }
}
