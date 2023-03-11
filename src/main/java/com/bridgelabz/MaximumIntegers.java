package com.bridgelabz;

public class MaximumIntegers {

    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        }

        return maxNum;
    }
}
