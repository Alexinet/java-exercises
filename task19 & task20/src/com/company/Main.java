package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections.*;
import java.util.List;
import java.lang.Integer;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Сколько номеров сгенерировать?");
        ArrayList<String> arr = new ArrayList<String>();
        int n = new Scanner(System.in).nextInt();
        Numeric num = new Numeric();

        for (int i = 0; i < n; i++) {
            arr.add(num.generate());
            System.out.println(arr.get(i));
        }

        Collections.sort(arr, Collections.reverseOrder());
        HashSet<String> h = new HashSet<String>(arr);
        TreeSet ts = new TreeSet(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер:");
        String find = scanner.nextLine();

        //-------
        long m = System.nanoTime();
        boolean temp = arr.contains(find);
        long mm = System.nanoTime();
        System.out.println("Прямой перебор: элемент " + (temp ? "найден" : "не найден") + ", поиск занял: " + (mm - m) + "нс");
        //-------
        m = System.nanoTime();
        int u = Collections.binarySearch(arr, find, Collections.reverseOrder());
        mm = System.nanoTime();
        if (u >= 0)
            System.out.println("Бинарный поиск: элемент найден, поиск занял: " + (mm - m) + "нс");
        else
            System.out.println("Бинарный поиск: элемент не найден, поиск занял: " + (mm - m) + "нс");
        //-------
        m = System.nanoTime();
        temp = h.contains(find);
        mm = System.nanoTime();
        System.out.println("Поиск в HashSet: элемент " + (temp ? "найден" : "не найден") + ", поиск занял: " + (mm - m) + "нс");
        //-------
        m = System.nanoTime();
        temp = ts.contains(find);
        mm = System.nanoTime();
        System.out.println("Поиск в TreeSet: элемент " + (temp ? "найден" : "не найден") + ", поиск занял: " + (mm - m) + "нс");
    }
}