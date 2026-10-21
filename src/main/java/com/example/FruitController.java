/*
* File: FruitController.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class FruitController {
    FruitService fruitService;
    FruitView fruitview;
    public FruitController(FruitService fruitService, FruitView fruitview) {
        this.fruitService = fruitService;
        this.fruitview = fruitview;
        initApplication();
    }

    private void initApplication() {
        List<Fruit> fruitList = fruitService.findAll();
        fruitview.printFruits(fruitList);
    }

}
