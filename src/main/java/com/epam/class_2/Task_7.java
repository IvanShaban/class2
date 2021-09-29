package com.epam.class_2;

public class Task_7 {
    public static void main(String[] args) {
        double a, b, h, y;
        a = 2;
        b = 3.5;
        h = 0.1;
        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for(double x = a; x <=b; x = x + h) {
            y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}
