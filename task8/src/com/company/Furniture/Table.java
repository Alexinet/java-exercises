package com.company.Furniture;

public class Table extends Furniture {

    private String color;

    Table(int price) {
        super(price);
    }

    public Table(int price, String color) {
        super(price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
