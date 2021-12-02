package com.company.Dish;

public class Pot extends Dish {
    int radius;
    int deep;
    double volume;
    double weight;

    public Pot(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {volume =  radius* deep* 10;}

    @Override
    public void calcWeight() {weight = radius * 1.58;}

    public void makeCourse(){
        System.out.println("Суп готов");
    }
}