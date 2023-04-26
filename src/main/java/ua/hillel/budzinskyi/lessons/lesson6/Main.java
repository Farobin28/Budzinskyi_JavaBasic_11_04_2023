package ua.hillel.budzinskyi.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Введіть число(3 спроби): ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Це правильне число!");
                return;
            } else {
                System.out.println("Неправильно! Спробуйте ще раз");
                attempts--;
                if (attempts > 0) {
                    System.out.println("У вас залишилось " + attempts + "спроб");
                }
            }
        }
        System.out.println("Ви витратили всі спроби. Число було " + randomNumber + ".");
    }
}
