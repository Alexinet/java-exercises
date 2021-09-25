package com.company;

import com.company.Book.BookTest;
import com.company.Circle.CircleTest;
import com.company.Human.Hand;
import com.company.Human.Head;
import com.company.Human.Human;
import com.company.Human.Leg;

public class Main {

    public static void humanTest() throws Exception {

        Head head = new Head(30, 20, 6400, "Black");

        Leg leftLeg = new Leg("long", 120);
        Leg rightLeg = new Leg("long",121);

        Hand lefthand = new Hand("long", 5);
        Hand rigthand = new Hand("Long", 3);

        Human human = new Human(head, new Leg[]{leftLeg, rightLeg}, new Hand[]{lefthand, rigthand});

        System.out.println("\n" + human.toString());
    }

    public static void main(String[] args) throws Exception {

        CircleTest.main(args);

        humanTest();

        BookTest.main(args);
    }
}
