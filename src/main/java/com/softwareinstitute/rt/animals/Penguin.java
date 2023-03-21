package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;

public class Penguin extends Bird {

    public Penguin(String fatherName, String motherName, int age) {
        super(fatherName, motherName, age);
    }

    @Override
    public void eat(String food) {

    }


    @Override
    public String communicate() {
        String birdNoise = "Honk";

        return birdNoise;
    }

    @Override
    public Animal reproduce(Animal parentAnimal) throws IncorrectParentAnimal {

        if(!parentAnimal.getClass().toString().equals(Penguin.class.toString())){
            throw new IncorrectParentAnimal("Animals are of different type");
        }

        Penguin penguin = new Penguin(parentAnimal.getName(),this.getName(),0);

        return penguin;

    }




}
