package ua.hillel.budzinskyi.lessons.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність M: ");
        int m = scanner.nextInt();
        System.out.print("Введіть розмірність N: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Введіть елемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Вихідна матриця:");
        printMatrix(matrix);
        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
