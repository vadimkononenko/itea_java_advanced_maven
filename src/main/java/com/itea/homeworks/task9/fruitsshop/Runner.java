package com.itea.homeworks.task9.fruitsshop;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        FruitsShop fruitsShop = new FruitsShop();
        Fruits fruitsF = new Fruits(FruitType.APPLE, 30, LocalDate.now(), 34.5);
        Fruits fruitsS = new Fruits(FruitType.BANANA, 20, LocalDate.now(), 30);
        Fruits fruitsT = new Fruits(FruitType.MANGO, 10, LocalDate.now(), 35);

        fruitsShop.addFruit(fruitsF);
        fruitsShop.addFruit(fruitsS);
        fruitsShop.addFruit(fruitsT);

        fruitsShop.save("/Users/vadimkononenko/Desktop/task.json");

        fruitsShop.load("/Users/vadimkononenko/Desktop/task.json");
    }
}
