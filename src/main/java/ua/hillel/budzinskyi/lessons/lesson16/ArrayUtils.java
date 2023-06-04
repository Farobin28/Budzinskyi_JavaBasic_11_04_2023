package ua.hillel.budzinskyi.lessons.lesson16;

public class ArrayUtils {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int[] row : matrix) {
            if (row.length != cols) {
                return false;
            }
        }

        return rows == cols;
    }
}
