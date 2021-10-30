package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void IsRegularExpression(String origin, String check) {

        Pattern pattern = Pattern.compile(origin);
        Matcher matcher = pattern.matcher(check);

        boolean found = matcher.matches();
        if(found)
            System.out.println("Строка соответсвует начальной.");
        else
            System.out.println("Строка не соответсвует начальной.");
    }

    public static void IsMacAddress(String adressMAC) {

        boolean found = adressMAC.matches("(\\S{2})[:](\\S{2})[:](\\S{2})[:](\\d{2})[:](\\d{2})[:](\\d{2})");

        if(found)
            System.out.println("Строка является MAC-адресом.");
        else
            System.out.println("Строка не является MAC-адресом.");
    }

    public static void PriceFinder(String text) {

        String[] words = text.split(" ");

        for (int i = 1; i < words.length; i++) {
            if (Objects.equals(words[i], "USD") || Objects.equals(words[i], "RUR")
                    || Objects.equals(words[i], "EU")) {

                System.out.println(words[i - 1] + " " + words[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите изначальную строку: ");
        String originSting = in.nextLine();
        System.out.println("Введите строку для проверки: ");
        String checkSting = in.nextLine();
        IsRegularExpression(originSting, checkSting);

        System.out.println("\nВведите строку для проверки соответсвию написания MAC-адреса: ");
        String adressMAC = in.nextLine();
        IsMacAddress(adressMAC);

        System.out.println("\nВведите текст для поиска цен в нем: ");
        String text = in.nextLine();
        PriceFinder(text);
    }
}
