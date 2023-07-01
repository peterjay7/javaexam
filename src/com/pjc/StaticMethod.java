package com.pjc;

import java.text.DecimalFormat;

public class StaticMethod {
    int i;

    public static void doSay() {
        System.out.println("This is static method: doSay()...");
    }

    public static double doSum(double x, double y) {
        System.out.println("This is static method: doSum()...");
        return x + y;
    }

    public static void doTest() {
        System.out.println(">>>>>>> this is static method: doTest()...");
        int age = 50;
        double wage = 0;
        if (age >= 30) {
            wage = age * 100;
        } else {
            wage = age * 50;
        }
        System.out.printf("age= %d, wage= %,.3f \n", age, wage);
        int i = 0;
        int total = 0;
        while (i <= 10) {
            i++;
            total += i;

            System.out.printf("i= %d, total= %d \n", i, total);
        }
        for (i = 1; i <= 10; i++) {
            total += i;
            System.out.printf("i= %d, total= %d \n", i, total);
        }
    }
}
