package com.github.madinaakhmedova.exercise_7;

import java.util.Scanner;

public class Main {

    static int x = 123;
    static int y = 434;
    static int z = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размер массива");
        int size = scanner.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Введите число");
            int val = scanner.nextInt();
            if (val == x || val == y || val == z) {
                System.out.println("Данное значение имеется в константах");
            }
            list[i] = val;
        }
    }
}
