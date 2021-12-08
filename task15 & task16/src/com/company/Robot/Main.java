package com.company.Robot;

import java.util.Scanner;

enum legs {RIGHT, LEFT};

public class Main {

    public static void main(String[] args) {

        Robot r = new Robot(legs.RIGHT);
        Robot l = new Robot(legs.LEFT);
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - шаг, 0 - выход");
        while ((i = scanner.nextInt()) != 0) {

            if (i == 1) {
                r.start();
                l.start();
            }
            System.out.println("1 - шаг, 0 - выход");
        }
    }
}