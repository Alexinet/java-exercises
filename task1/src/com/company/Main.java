package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void func_five() {
        System.out.println("\nВывод 10 первых чисел гармонического ряда:");
        for (int i = 2; i < 12; i++) {
            System.out.println("1/" + (i * i - 1));
        }
        System.out.println("\n");
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void func_six() {
        Random random = new Random();
        int masQuantity = random.nextInt(100);
        int[] arrayRandom = new int[masQuantity] ;

        for (int i = 0; i < masQuantity; i++) {
            arrayRandom[i] = (int) Math.round(100 * Math.random());
        }

        System.out.println("Вывод неотсоритрованного массива:\n" + Arrays.toString(arrayRandom));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arrayRandom.length; i++) {
                if (arrayRandom[i] < arrayRandom[i - 1]) {
                    swap(arrayRandom, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println("\nВывод отсортированного массива:\n" + Arrays.toString(arrayRandom));
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void func_seven() {
        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println("\nЧисло равно " + number);
        System.out.println("\nФакториал числа равен " + factorial(number));
    }

    public static void main(String[] args) {
        func_five();
        func_six();
        func_seven();
    }
}
