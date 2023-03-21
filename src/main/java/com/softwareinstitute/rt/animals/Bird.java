package com.softwareinstitute.rt.animals;

public abstract class Bird extends Animal {


    @Override
    public String reproduce(Animal parentAnimal) {

        String newAnimal = "An egg is laid: ";
        return newAnimal+parentAnimal.getClass().toString().substring(39);

    }





}
