package com.bridgelabz;

public class MaximumFloats {
    public static float findMax(float num1, float num2, float num3) {
        float maxNum = num1;

        if (num2 > maxNum) {
            maxNum = num2;
        }

        if (num3 > maxNum) {
            maxNum = num3;
        }

        return maxNum;
    }
}
