package com.github.madinaakhmedova.exercise_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размер массива");
        int size = scanner.nextInt();

        double[] list = new double[size];
        double total = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Введите число %d\n", i);
            double val = scanner.nextDouble();
            list[i] = val;
            total += val;
        }
        double avg = total / (size);
        System.out.printf("Среднее арифметическое: %f\n", avg);

        for (double x : list) {
            System.out.printf("%f * %f = %f\n", x, avg, x * avg);
        }
    }
}
