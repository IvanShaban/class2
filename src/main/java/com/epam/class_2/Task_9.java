package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] firsArray = createArray();
        double[] secondArray = createArray();
        System.out.println("Введите К");
        int k = Integer.parseInt(reader.readLine());
        double[] finalArray = new double[firsArray.length + secondArray.length];
        for (int i = 0; i < k; i++) {
            finalArray[i] = firsArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            finalArray[i + k] = secondArray[i];
        }
        for (int i = k; i < firsArray.length; i++) {
            finalArray[k + secondArray.length] = firsArray[i];
        }

        for (double number : finalArray) {
            System.out.println(number);
        }
    }

    public static double[] createArray () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел в массиве");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Введите числа для массива");
        double[] array = new double[x];
        for (int i = 0; i < array.length; i++) {
            double b = Integer.parseInt(reader.readLine());
            array[i] = b;
        }
        return array;
    }
}
