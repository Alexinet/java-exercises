package com.company.Dish;

public class Pan extends Dish {
    int radius;
    int deep;
    double volume;
    double weight;

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {volume =  radius* deep* 9;}

    @Override
    public void calcWeight() {weight = radius * 1.44;}

    public void makeCourse(){
        System.out.println("Второе блюдо готово");
    }
}