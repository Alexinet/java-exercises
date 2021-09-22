package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void func_five() {
        System.out.println("\nВывод 10 первых чисел гармонического ряда:");
        for (int i = 2; i < 12; i++) {
            System.out.println("1/" + (i * i - 1));
        }
    }

    public static void func_six() {
        Random masQuantity = new Random();
        masQuantity.nextInt(100);

        int[] arrayRandom = new int[masQuantity] ;

        for (int i = 0; i < masQuantity; i++) {
            arrayRandom[i] = (int) Math.round(100 * Math.random());
        }


        System.out.println(masQuantity);
        System.out.println(Arrays.toString(arrayRandom));

    }

    public static void main(String[] args) {

        //func_five();
        func_six();
    }
}
