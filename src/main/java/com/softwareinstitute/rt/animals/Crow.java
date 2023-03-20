package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.interfaces.Flying;

public class Crow extends Bird implements Flying {


    @Override
    public void eat(String food) {



    }

    @Override
    public void move() {

        takeOff();
        flight();
        landing();


    }

    @Override
    public String communicate() {
        String birdNoise = "Caw";

        return birdNoise;
    }

    @Override
    public void takeOff() {

        setEnergyLevel(getEnergyLevel()-5);


    }

    @Override
    public void flight() {

        setEnergyLevel(getEnergyLevel()-10);

    }

    @Override
    public void landing() {

        setEnergyLevel(getEnergyLevel()-1);

    }
}
