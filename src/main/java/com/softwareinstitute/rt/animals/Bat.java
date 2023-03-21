package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;
import com.softwareinstitute.rt.interfaces.Flying;

public class Bat extends Mammal implements Flying {


    public Bat(String fatherName, String motherName, int age) {
        super(fatherName, motherName, age);
    }

    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

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

    @Override
    public Animal reproduce(Animal parentAnimal) throws IncorrectParentAnimal {

        if(!parentAnimal.getClass().toString().equals(Bat.class.toString())){
            throw new IncorrectParentAnimal("Animals are of different type");
        }

        Bat bat = new Bat(parentAnimal.getName(),this.getName(),0);


        return bat;

    }



}
