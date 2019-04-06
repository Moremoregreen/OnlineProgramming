package com.mmg.Codility;

import java.util.Stack;

public class Nesting {
    public static void main(String[] args) {

    }
    public static int solution(String S){

        // special case 1: empty string
        if( S.length() ==0)
            return 1;
            // special case 2: odd length
        else if( S.length() % 2 == 1)
            return 0;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push(S.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return 0;
                    else stack.pop();
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
