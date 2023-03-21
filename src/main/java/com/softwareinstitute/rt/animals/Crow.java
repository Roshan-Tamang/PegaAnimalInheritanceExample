package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.interfaces.Flying;

public class Crow extends Bird implements Flying {




    @Override
    public void eat(String food) {

        this.setLastFoodEaten("Berry");

    }

    @Override
    public Animal reproduce(Animal parentAnimal) {
        return null;
    }

   /* @Override
    public void move() {

        takeOff();
        flight();
        landing();


    }*/

    @Override
    public String communicate() {
        String birdNoise = "Caw";

        return birdNoise;
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

//z
}
