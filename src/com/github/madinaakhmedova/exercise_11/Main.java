package com.github.madinaakhmedova.exercise_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число (можно с точкой)");
        String sVal = scanner.nextLine();
        System.out.println("Введите второе число (целое");
        int iVal = scanner.nextInt();

        Double val1 = (double) iVal;
        double val2 = Double.parseDouble(sVal);
        boolean equals = val1.equals(val2);
        System.out.println(equals);
        if (!equals) {
            double max = Math.max(val2, iVal);
            double min = Math.min(val2, iVal);
            System.out.printf("Наибольее число - %f\nНаименьшее число - %f", max, min);
        } else {
            System.out.println("Числа равны");
        }
    }
}
