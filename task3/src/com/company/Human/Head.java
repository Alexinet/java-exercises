package com.company.Human;

public class Head {
    private int length, width, mass;
    private String hairColor;

    public Head(int length, int width, int mass, String hairColor) {
        this.length = length;
        this.width = width;
        this.mass = mass;
        this.hairColor = hairColor;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "length=" + length + "cm" +
                ", width=" + width + "cm" +
                ", mass=" + mass + "g" +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
