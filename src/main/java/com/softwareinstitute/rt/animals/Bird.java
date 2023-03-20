package com.softwareinstitute.rt.animals;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String reproduce(Animal parentAnimal) {

        String newAnimal = "An egg is laid: ";
        return newAnimal+parentAnimal.getClass();

    }





}
