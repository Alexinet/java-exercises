package com.company.Furniture;

public class Sofa extends Furniture {

    private String color;

    Sofa(int price) {
        super(price);
    }

    public Sofa(int price, String color) {
        super(price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "color='" + color + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
