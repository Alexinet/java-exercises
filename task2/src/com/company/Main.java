package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n" + new ShapeTester("green", "medium",
                "light", 15, 20, 10));

        System.out.println("\n" + new Ball("red", "dark", "metal", "big", 16));

        System.out.println("\n");
        Book.getBookInformation("Call of Cthulhu", "Howard Phillips Lovecraft", "one", 680);

        System.out.println("\n" +new Dog("Шарик", 2));
        System.out.println("\n");

       ////Методы добавления и вывода инфы о списке собак
        PitomnikSobak pitomnikTest = new PitomnikSobak();

        while (true) {
            pitomnikTest.addDog();
            pitomnikTest.pitomnikSobakOut();

        }
    }

}