package com.company.Dog;

public class IrishTerrier extends Dog {
    int weight;
    int height;
    double averageWeight;

    public IrishTerrier(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void calcAverageWeight() {averageWeight = weight * 1.34 * height * 0.22;}
}
