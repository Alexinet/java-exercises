package com.company.Chairs;

import java.util.Scanner;

public class Client {

    Client() {
    }

    public void ChangeChair() {

        ChairFactory newChair = new ChairFactory();
        int choice = 1;
        while (choice > 0) {
            System.out.print("1 - Викторианский стул\n2 - Многофункциональный стул\n3 - Магический стул\n0 - Выход\n");
            switch (new Scanner(System.in).nextInt()) {
                case 0: {
                    choice = 0;
                    break;
                }
                case 1: {
                    newChair.createVictorian();
                    break;
                }
                case 2: {
                    newChair.createMultiFunc();
                    break;
                }
                case 3: {
                    newChair.createMagic();
                    break;
                }
                default: {
                    choice = 1;
                    System.out.println("Неверный код действия");
                }
            }
        }
    }
}