package com.softwareinstitute.rt.animals;

public abstract class Mammal extends Animal {


    //Variable


    //Constructor


    //Method


    @Override
    public String reproduce(Animal parentAnimal) {

        String newAnimal = "A live-birth of animal: ";
        return newAnimal+parentAnimal.getClass();

    }




}
