package com.company.Furniture;

public class Chair extends Furniture {

    private String size;

    Chair(int price) {
        super(price);
    }

    public Chair(int price, String size) {
        super(price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "size='" + size + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
