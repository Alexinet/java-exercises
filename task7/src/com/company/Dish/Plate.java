package com.company.Dish;

public class Plate extends Dish {
    int radius;
    int deep;
    double volume;
    double weight;

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
        calcWeight();
    }

    //Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
    // Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
    @Override
    public void calcVolume() {volume = radius * deep;}

    @Override
    public void calcWeight() {weight = volume * 1.22;}
}