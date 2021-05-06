package com.github.madinaakhmedova.exercise_7;

import java.util.Scanner;

public class Main {

    static double x = 123;
    static double y = 434;
    static double z = 7.7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размер массива");
        int size = scanner.nextInt();

        double[] list = new double[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Введите число");
            double val = scanner.nextDouble();
            if (val == x || val == y || val == z) {
                System.out.println("Данное значение имеется в константах");
            }
            list[i] = val;
        }
    }
}
