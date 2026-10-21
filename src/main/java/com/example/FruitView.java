package com.example;

import java.util.List;

public class FruitView {
    public void printFruits(List<Fruit> fruitList) {
        fruitList.forEach(fruit -> {
            System.out.println(fruit);
        });
    }
}
