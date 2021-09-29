package com.epam.class_2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task_2 {
    public static void main(String[] args) {
        double a, b, c, result;
        a = 1.0;
        b = 2.0;
        c = 3.0;
        if (a != 0) {
            result = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
            System.out.println(result);
        } else {
            System.out.println("Знаменатель равен нулю.");
        }
    }
}
