package com.mmg.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
        輸入字串 照順序排列
 */

public class YourOrderPlease {
    public static void main(String[] words) {
        String words1 = "is2 Thi1s T4est 3a";
        String words2 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(words1));
        if (words1 ==""){
            System.out.println(words1);
        }
    }
    private static String order(String words){
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        StringTokenizer st = new StringTokenizer(words);
        String[] stringWords = new String[st.countTokens()];

        while (st.hasMoreTokens()){
            String currentWord = st.nextToken();
            for (int i = 0; i < currentWord.length(); i++) {
                if (numbers.contains(currentWord.charAt(i))){
                    stringWords[numbers.indexOf(currentWord.charAt(i))] = currentWord;
                }
            }
        }
        StringBuilder sb =new StringBuilder();
        for (String s:stringWords)
            sb.append(s+ ' ');
        return sb.toString().trim();

    }
}
