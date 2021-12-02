package com.company.Dog;

public class GermanShepherd extends Dog {
    int weight;
    int height;
    double averageWeight;

    public GermanShepherd(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void calcAverageWeight() {averageWeight = weight * 1.42 * height * 0.26;}
}
