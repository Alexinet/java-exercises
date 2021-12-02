package com.company.Dog;

public class Akita extends Dog {
    int weight;
    int height;
    double averageWeight;

    public Akita(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void calcAverageWeight() {averageWeight = weight * 1.64 * height * 0.19;}
}
