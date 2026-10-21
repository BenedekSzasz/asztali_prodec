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
