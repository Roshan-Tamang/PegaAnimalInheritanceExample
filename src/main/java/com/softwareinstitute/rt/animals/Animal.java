package com.softwareinstitute.rt.animals;


import com.softwareinstitute.rt.exceptions.InsufficientEnergy;

public abstract class Animal {

    private String name;
    private String lastFoodEaten;
    private boolean alive = true;


    public abstract void eat(String food);

     public abstract Animal reproduce(Animal parentAnimal);

    // public abstract void breathe();


    public abstract String communicate();

    public String sleep(){
        String sleepNoise = "Snores";

        return sleepNoise;

    }

    public void die(){
        alive = false;
    }

    public String excrete(){

        return "excrete material";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastFoodEaten() {
        return lastFoodEaten;
    }

    public void setLastFoodEaten(String lastFoodEaten) {
        this.lastFoodEaten = lastFoodEaten;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
