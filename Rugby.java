package com.gmail.iwerdss;

public class Rugby {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        int[] teamFirstAges = randomAges(teamSize, minAge, maxAge);
        int[] teamSecondAges = randomAges(teamSize, minAge, maxAge);

        System.out.println("Вік гравців команди 1: ");
        printAges(teamFirstAges);

        System.out.println("\nВік гравців команди 2: ");
        printAges(teamSecondAges);

        System.out.println("\nСередній вік команди 1: " + averageAge(teamFirstAges));
        System.out.println("Середній вік команди 2: " + averageAge(teamSecondAges));
    }

    private static int[] randomAges(int size, int minAge, int maxAge) {
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = minAge + (int) (Math.random() * (maxAge - minAge + 1));
        }
        return ages;
    }

    private static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    private static double averageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}
