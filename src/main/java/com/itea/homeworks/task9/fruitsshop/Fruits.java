package com.itea.homeworks.task9.fruitsshop;

import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Fruits {
    private FruitType fruitType;
    private int shelfLife;
    private LocalDate dateOfSupply;
    private double price;

    public Fruits(FruitType fruitType, int shelfLife, LocalDate dateOfSupply, double price) {
        this.fruitType = fruitType;
        this.shelfLife = shelfLife;
        this.dateOfSupply = dateOfSupply;
        this.price = price;
    }
}
