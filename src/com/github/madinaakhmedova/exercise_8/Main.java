package com.github.madinaakhmedova.exercise_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите любое положительное число");
        int size = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= size; i = i + 2) {
            total += i;
        }
        System.out.printf("Сумма всех нечетных чисел: %d", total);
    }
}
