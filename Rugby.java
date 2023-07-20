package com.gmail.iwerdss;

public class Rugby {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        int[] teamFirstAges = RandomAges(teamSize, minAge, maxAge);
        int[] teamSecondAges = RandomAges(teamSize, minAge, maxAge);

        System.out.println("Вік гравців команди 1: ");
        printAges(teamFirstAges);

        System.out.println("\nВік гравців команди 2: ");
        printAges(teamSecondAges);

        System.out.println("\nСередній вік команди 1: " + AverageAge(teamFirstAges));
        System.out.println("Середній вік команди 2: " + AverageAge(teamSecondAges));
    }

    private static int[] RandomAges(int size, int minAge, int maxAge) {
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

    private static double AverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}