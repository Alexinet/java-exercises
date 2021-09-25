package com.company.Circle;

public class Circle {

    private String color, size, brightness;
    private int radius, mass;

    public Circle(String color, String size, String brightness, int radius, int mass) {
        this.color = color;
        this.size = size;
        this.brightness = brightness;
        this.radius = radius;
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brightness='" + brightness + '\'' +
                ", radius=" + radius + "cm" +
                ", mass=" + mass + "kg" +
                '}';
    }
}
