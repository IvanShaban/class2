package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координату x.");
        double x = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату y.");
        double y = Integer.parseInt(reader.readLine());
        if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
            System.out.println(true);
        } else if (y > 0 && y <= -3 && x >= -4 && x <= 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
