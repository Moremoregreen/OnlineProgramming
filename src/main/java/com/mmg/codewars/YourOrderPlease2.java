package com.mmg.codewars;

import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class YourOrderPlease2 {
    public static void main(String[] args) {
        String words = "thi1s is2 boo4k t3he";
        System.out.println(order2(words));
    }

    private static String order2(String words) {
        return Pattern.compile(" ")
                .splitAsStream(words)
                .sorted(Comparator.comparingInt(YourOrderPlease2::intExtractor))
                .collect(Collectors.joining(" "));
    }

    public static int intExtractor(String candidate){
        return new Scanner(candidate).useDelimiter("\\D+").nextInt();
    }
}
