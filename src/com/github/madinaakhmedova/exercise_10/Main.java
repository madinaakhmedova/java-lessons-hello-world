package com.github.madinaakhmedova.exercise_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размерность n матрицы");
        int n = scanner.nextInt();
        System.out.println("Выберите размерность m матрицы");
        int m = scanner.nextInt();

        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Выберите элемент матрицы (%d, %d)\n", i, j);
                double val = scanner.nextDouble();
                matrix[i][j] = val;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", matrix[i][j] *3);
            }
            System.out.print("\n");
            break;
        }
    }
}
