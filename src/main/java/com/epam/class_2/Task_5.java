package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа.");
        double a = Integer.parseInt(reader.readLine());
        double b = Integer.parseInt(reader.readLine());
        double c = Integer.parseInt(reader.readLine());
        double[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            int coefficient;
            if (array[i] >= 0) {
                coefficient = 2;
            } else {
                coefficient = 4;
            }
            System.out.println(Math.pow(array[i], coefficient));
        }
    }
}
