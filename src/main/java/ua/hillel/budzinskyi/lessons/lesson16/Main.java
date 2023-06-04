package ua.hillel.budzinskyi.lessons.lesson16;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = ArrayUtils.calculateAverage(array);
        System.out.println("Average: " + average);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);
        System.out.println("Is square matrix: " + isSquare);
    }
}
