package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел в массиве");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Введите числа для массива");
        int[] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            int b = Integer.parseInt(reader.readLine());
            a[i] = b;
        }

        System.out.println("Введите К");
        int k = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("Сумма чисел кратных К = " + sum);
    }
}
