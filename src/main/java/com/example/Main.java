/*
* File: Main.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gyümölcsök....");

        FruitService fruitService = new FruitService(new Sqlite());
        FruitView fruitView = new FruitView();
        new FruitController(fruitService, fruitView);
    }
}