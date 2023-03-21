package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;
import com.softwareinstitute.rt.interfaces.Flying;

public class Crow extends Bird implements Flying {


    public Crow(String fatherName, String motherName, int age) {
        super(fatherName, motherName, age);
    }

    @Override
    public void eat(String food) {

        this.setLastFoodEaten("Berry");

    }

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

    @Override
    public Animal reproduce(Animal parentAnimal) throws IncorrectParentAnimal {

        if(!parentAnimal.getClass().toString().equals(Crow.class.toString())){
            throw new IncorrectParentAnimal("Animals are of different type");
        }

        Crow crow = new Crow(parentAnimal.getName(),this.getName(),0);

        return crow;

    }

}
