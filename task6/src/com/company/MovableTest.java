package com.company;

class MovableTest {

    public static void main(String[] args) {

        System.out.println("\nПрямоугольник:");
        MovableRectangle myMovableRectangle = new MovableRectangle("blue", true, 5, 5);
        myMovableRectangle.moveFor(1, 0);
        System.out.println(myMovableRectangle.toString());

    }
}