package com.company;

import com.company.Furniture.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Furniture myTable = new Table(199, "Grey");
        Furniture myChair = new Chair(129, "medium");
        Furniture mySofa = new Sofa(259, "Red");

        FurnitureShop store = new FurnitureShop(myTable, myChair, mySofa);
        FurnitureShop user = new FurnitureShop();

        System.out.println("Каталог товаров: ");
        store.printStock();

        System.out.println("\nВвдите id предмета для добавления в корзину: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        user.addToBasket(store.getItem(id));

        user.printBasket();
    }
}
