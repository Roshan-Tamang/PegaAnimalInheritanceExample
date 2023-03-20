package com.softwareinstitute.rt.animals;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void move() {


    }

    @Override
    public String communicate() {
        String birdNoise = "Honk";

        return birdNoise;
    }
}
