package com.company.Furniture;

import java.util.ArrayList;
import java.util.Collections;

public class FurnitureShop {

    private ArrayList<Furniture> assortment = new ArrayList<Furniture>();

    public FurnitureShop(Furniture... items) {
        Collections.addAll(assortment, items);
    }

    public void addToStock(Furniture item) {
        assortment.add(item);
    }

    public Furniture getItem(int index) {
        return assortment.get(index);
    }

    public void printStock() {
        System.out.println("- Товары в наличии:");
        for (Furniture item : assortment) System.out.println(item.toString());
    }

    private ArrayList<Furniture> basket = new ArrayList<Furniture>();

    public void addToBasket(Furniture item) {
        basket.add(item);
    }

    public void printBasket() {
        System.out.println("- Корзина:");
        for (Furniture i : basket) System.out.println(i.toString());
    }
}
