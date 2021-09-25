package com.company;

public class Ball {

    private String color, brightness, material, size;
    private int radius;

    public Ball(String color, String brightness, String material, String size, int radius) {
        this.color = color;
        this.brightness = brightness;
        this.material = material;
        this.size = size;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", brightness='" + brightness + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", radius=" + radius +
                '}';
    }
}
