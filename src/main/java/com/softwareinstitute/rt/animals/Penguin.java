package com.softwareinstitute.rt.animals;

public class Penguin extends Bird {

    @Override
    public void eat(String food) {

    }

    @Override
    public Animal reproduce(Animal parentAnimal) {
        return null;
    }

    @Override
    public String communicate() {
        String birdNoise = "Honk";

        return birdNoise;
    }
}
