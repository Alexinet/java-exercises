package com.company;

import java.util.Random;

public class Numeric {

    Numeric() {
    }

    public String generate() {

        String str = "";

        int character = (int) (new Random()).nextInt(9);
        str += (char) ((new Random()).nextInt(90 - 65) + 65);

        for (int i = 0; i < 3; i++)
            str += character;

        for (int i = 0; i < 2; i++)
            str += (char) ((new Random()).nextInt(90 - 65) + 65);

        for (int i = 0; i < 2; i++) {
            character = (int) (new Random()).nextInt(9);
            str += character;
        }

        return str;
    }
}