package com.company;

import java.util.Random;

public class Main {

    public static void func_five() {
        System.out.println("\nВывод 10 первых чисел гармонического ряда:");
        for (int i = 2; i < 12; i++) {
            System.out.println("1/" + (i * i - 1));
        }
    }

    public static void func_six() {
        int masQuantity = (int) Math.round(100 * Math.random()); //количество эл-тов в массиве(1-100)

        int[] arrayRandom = new int[masQuantity] ;

        for (var i: arrayRandom) {
            int i = new Random();
        }

        System.out.println(masQuantity);
        System.out.println(arrayRandom);

    }

    public static void main(String[] args) {

        //func_five();
        func_six();
    }
}
