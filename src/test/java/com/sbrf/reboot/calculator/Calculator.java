package com.sbrf.reboot.calculator;

import static java.lang.Math.pow;

public class Calculator {
    public static int getAddition(int x, int y) {
        return x + y;
    }

    public static int getSubtraction(int x, int y) {
        return x - y;
    }

    public static int getMultiplication(int x, int y) {
        return x * y;
    }

    public static int getDivision(int x, int y) {
        return x / y;
    }

    public static int getModulo(int x, int y) {
        return x % y;
    }

    public static int getPower(int x, int y) {
        return (int) pow(x, y);
    }

    public static int getFactorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * getFactorial(x - 1);
        }
    }
}
