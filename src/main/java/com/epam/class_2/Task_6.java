package com.epam.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.println("Введите 3 числа.");
        for (int i = 0; i < 3; i++) {
            double a = Integer.parseInt(reader.readLine());
            arrayList.add(a);
        }
        System.out.println("MAX = " + Collections.max(arrayList));
        System.out.println("MIN = " + Collections.min(arrayList));
    }
}
