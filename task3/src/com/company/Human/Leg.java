package com.company.Human;

public class Leg {

    private String size;
    private int length;

    public Leg(String size, int length) {
        this.size = size;
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size='" + size + '\'' +
                ", length=" + length + "cm" +
                '}';
    }
}
