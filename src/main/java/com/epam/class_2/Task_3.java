package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину катета 1.");
        double a = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину катета 2.");
        double b = Integer.parseInt(reader.readLine());
        double c = sqrt(a * a + b * b);
        System.out.println("P = " + (a + b + c));
        System.out.println("S = " + (a * b / 2));
    }
}
