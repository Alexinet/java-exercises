package com.company;

class MovableTest {

    public static void main(String[] args) {

        System.out.println("\nТочка:");
        MovablePoint myMovablePoint = new MovablePoint(2, 1);
        myMovablePoint.moveFor(10, 10);
        System.out.println(myMovablePoint.toString());

        System.out.println("\nКруг:");
        MovableCircle newMovableCircle = new MovableCircle(2, 1, 3);
        newMovableCircle.moveFor(12, 10);
        System.out.println(newMovableCircle.toString());

    }
}