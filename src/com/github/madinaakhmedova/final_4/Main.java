package com.github.madinaakhmedova.final_4;

import java.util.Scanner;

public class Main {

    static String ANSWER = "заархивированный вирус";
    static String HELP = "подсказка";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку. Вы имеете 3 попытки, а так же на первом шаге 1 подсказку (введите `подсказка`).");
        System.out.println("Загадка:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает?");

        inCycle(scanner);
    }

    private static void inCycle(Scanner scanner) {
        int i = 0;
        while (i < 3) {
            String v = scanner.nextLine();
            if (compare(v, ANSWER)) {
                System.out.println("Правильно!");
                return;
            }
            if (compare(v, HELP)) {
                // Подсказка не считается попыткой
                if (i == 0) {
                    System.out.println("Это что-то из компьютерных программ");
                } else {
                    System.out.println("Подсказкой можно восспользоваться только на 1-м шаге и только 1 раз");
                }
                continue;
            }
            if (i < 2) {
                System.out.println("Подумай еще!");
            }
            i++;
        }

        System.out.println("Обидно, приходи в другой раз!");
    }

    public static boolean compare(String value, String base) {
        value = value.trim().toLowerCase();
        base = base.trim().toLowerCase();
        return value.equals(base);
    }
}
