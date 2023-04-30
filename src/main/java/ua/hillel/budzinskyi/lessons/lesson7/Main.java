package ua.hillel.budzinskyi.lessons.lesson7;

import java.util.Random;

public class Main {
        public static void main(String[] args) {
            int teamSize = 25;
            int[] team1 = new int[teamSize];
            int[] team2 = new int[teamSize];
            int sum1 = 0, sum2 = 0;
            Random rand = new Random();
            for (int i = 0; i < teamSize; i++) {
                team1[i] = rand.nextInt(23) + 18;
                team2[i] = rand.nextInt(23) + 18;
            }
            System.out.println("Вік гравців першої команди:");
            for (int i = 0; i < teamSize; i++) {
                System.out.print(team1[i] + " ");
                sum1 += team1[i];
            }
            System.out.println("\nВік гравців другої команди:");
            for (int i = 0; i < teamSize; i++) {
                System.out.print(team2[i] + " ");
                sum2 += team2[i];
            }
            double avg1 = (double)sum1 / teamSize;
            double avg2 = (double)sum2 / teamSize;
            System.out.println("\nСередній вік гравців першої команди: " + avg1);
            System.out.println("Середній вік гравців другої команди: " + avg2);
        }
    }