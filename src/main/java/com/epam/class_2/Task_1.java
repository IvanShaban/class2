package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите четырехзначное число.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if ((number / 1000 + (number / 100) % 10) == ((number / 10) % 10 + number % 10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
