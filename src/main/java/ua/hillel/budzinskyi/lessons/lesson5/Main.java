package ua.hillel.budzinskyi.lessons.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name command 1: ");
        String firstTeamName = scanner.nextLine();

        int[] killsFirstTeam = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter kills " + (i + 1) + "st player: ");
            killsFirstTeam[i] = scanner.nextInt();
        }

        scanner.nextLine();
        System.out.print("Enter name command 2: ");
        String secondTeamName = scanner.nextLine();

        int[] killsSecondTeam = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter kills " + (i + 1) + "st player: ");
            killsSecondTeam[i] = scanner.nextInt();
        }

        int sumOfFragsFirstTeam = Arrays.stream(Arrays.stream(killsFirstTeam).toArray()).sum();
        int sumOfFragsSecondTeam = Arrays.stream(Arrays.stream(killsSecondTeam).toArray()).sum();

        if (sumOfFragsFirstTeam / 5 > sumOfFragsSecondTeam / 5) {
            System.out.println("Перемогла команда " + firstTeamName + " набрала " + sumOfFragsFirstTeam + " очків");
        } else {
            System.out.println("Перемогла команда " + secondTeamName + " набрала " + sumOfFragsSecondTeam + " очків");
        }
    }
}

