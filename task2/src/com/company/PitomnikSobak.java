package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PitomnikSobak{

    private ArrayList<Dog> dogs = new ArrayList<>();

    public PitomnikSobak() {
    }

    public void addDog() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 для добавления информации о собаке: ");
        String decision = in.next();

        if (Objects.equals(decision, "1")) {
            Scanner name_temp = new Scanner(System.in);
            System.out.println("Введите имя собаки: ");
            String name = name_temp.next();
            Scanner age_temp = new Scanner(System.in);
            System.out.println("Введите возраст собаки: ");
            int age = age_temp.nextInt();
            int humanAge = age * 7;

            dogs.add(new Dog(name, age));
        } else {
            System.exit(0);
        }
    }

    public void pitomnikSobakOut() {
        System.out.println("\n");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return "PitomnikSobak{" +
                "Dogs=" + dogs +
                '}';
    }
}