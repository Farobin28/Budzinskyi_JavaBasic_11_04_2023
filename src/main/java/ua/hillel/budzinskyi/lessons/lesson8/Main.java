package ua.hillel.budzinskyi.lessons.lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomArray();
        int[] guessedNumbers = generateRandomArray();
        Arrays.sort(lotteryNumbers);
        Arrays.sort(guessedNumbers);
        int matchesCount = countMatches(lotteryNumbers, guessedNumbers);
        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(guessedNumbers));
        System.out.println("Кількість збігів: " + matchesCount);
    }
    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    private static int countMatches(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }
}