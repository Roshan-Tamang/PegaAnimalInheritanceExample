package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.interfaces.Flying;

public class Bat extends Mammal implements Flying {


    //Variable


    //Constructor
    public Bat(String name) {
        super(name);
    }

    //Methods


    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

    }

    @Override
    public void move() {

    }

    @Override
    public String communicate() {
        String batNoise = "Chirp";

        return batNoise;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void flight() {

    }

    @Override
    public void landing() {

    }
}
