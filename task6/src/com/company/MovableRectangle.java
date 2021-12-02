package com.company;

import com.company.shape.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {

    private int x, y;

    public MovableRectangle(String color, boolean filled, double width, double length, int x, int y) {
        super(color, filled, width, length);
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    public MovableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
        this.x = (int) Math.round(width / 2);
        this.y = (int) Math.round(length / 2);
    }

    public MovableRectangle(double width, double length) {
        super(width, length);
        this.x = (int) Math.round(width / 2);
        this.y = (int) Math.round(length / 2);
    }

    @Override
    public void moveFor(int rightX, int downY) {
        this.x += Math.abs(rightX);
        this.y += Math.abs(downY);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + super.getWidth() +
                ", length=" + super.getLength() +
                ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +
                '}';
    }

}