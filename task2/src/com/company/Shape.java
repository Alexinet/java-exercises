package com.company;

public class Shape {

    private String color, size, brightness;
    private int radius, height, width;

    public Shape(String color, String size, String brightness, int radius, int height, int width) {
        this.color = color;
        this.size = size;
        this.brightness = brightness;
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brightness='" + brightness + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}