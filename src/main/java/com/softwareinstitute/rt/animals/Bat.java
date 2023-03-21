package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.interfaces.Flying;

public class Bat extends Mammal implements Flying {



    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

    }

    @Override
    public void move() {
        takeOff();
        flight();
        landing();
    }

    @Override
    public String communicate() {

        return "Chirp";
    }

    @Override
    public void takeOff() {
        // To be implemented

    }

    @Override
    public void flight() {
        // To be implemented

    }

    @Override
    public void landing() {
        // To be implemented

    }
}
