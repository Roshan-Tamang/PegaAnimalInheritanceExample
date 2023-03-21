package com.softwareinstitute.rt.animals;


import com.softwareinstitute.rt.exceptions.InsufficientEnergy;

public abstract class Animal {

    private String name;
    private String lastFoodEaten;

    public abstract void eat(String food);

//    public abstract Animal reproduce(Animal parentAnimal);


    public abstract String communicate();

    public String sleep(){
        String sleepNoise = "Snores";

        return sleepNoise;

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

    
}
