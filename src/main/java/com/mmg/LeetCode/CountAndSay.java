package com.mmg.LeetCode;

/*
難度:EASY
n=1時輸出字符串1；n=2時，數上次字符串中的數值個數，因為上次字符串有1個1，所以輸出11；
n=3時，由於上次字符是11，有2個1，所以輸出21；n=4時，由於上次字符串是21，有1個2和1個1，
所以輸出1211。依次類推，寫個countAndSay(n)函數返回字符串。
1.     1
2.     11
3.     21
4.     1211
5.     111221
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        if (n == 1) {
            return "1";
        } else if (n == 2) {
            return "11";
        } else {
            String temp = countAndSay(n - 1);  //21
            for (int i = 0; i < temp.length(); i++) {  // 0 12
                //                              temp有兩個一樣的數字
                while (i < temp.length() - 1 && temp.charAt(i) == temp.charAt(i + 1)) {
                    counter++;
                    i++;
                }
                System.out.println(sb);
                System.out.println(i+"  " + n);
                sb = sb.append(++counter).append(temp.charAt(i));
                counter = 0;
            }
        }
        return sb.toString();
    }
}
