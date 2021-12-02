package com.company;

import com.company.Dish.Dish;
import com.company.Dish.Pan;
import com.company.Dish.Plate;
import com.company.Dish.Pot;
import com.company.Dog.Akita;
import com.company.Dog.Dog;
import com.company.Dog.GermanShepherd;
import com.company.Dog.IrishTerrier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(2,9);
        Dish pan = new Pan(6,56);
        Dish pot = new Pot(7, 100);

        plate.calcVolume();
        ((Pan)pan).makeCourse();
        ((Pot)pot).makeCourse();

        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        allDishes.add(pot);

        for(Dish d : allDishes)
          System.out.println(d);

        System.out.println("\n");

        Dog germanShepherd = new GermanShepherd(26, 56);
        Dog akita = new Akita(31, 50);
        Dog irishTerrier = new IrishTerrier(25, 49);

        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(germanShepherd);
        allDogs.add(akita);
        allDogs.add(irishTerrier);

        for(Dog i : allDogs)
            System.out.println(i);
    }
}