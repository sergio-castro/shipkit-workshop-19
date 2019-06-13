package com.example.shipkitworkshop;

/**
 * My javadoc
 */
public class MathUtils {

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}
