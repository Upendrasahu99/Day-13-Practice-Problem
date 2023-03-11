package com.bridgelabz;

public class MaximumStrings {
    public static String findMax(String str1, String str2, String str3) {
        String maxString = str1;

        if (str2.compareTo(maxString) > 0) {
            maxString = str2;
        }

        if (str3.compareTo(maxString) > 0) {
            maxString = str3;
        }

        return maxString;
    }
}
