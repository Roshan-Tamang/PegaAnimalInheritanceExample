package com.softwareinstitute.rt.animals;


import com.softwareinstitute.rt.exceptions.InsufficientEnergy;

public abstract class Animal {

    private String name;
    private String lastFoodEaten;
    private String noOfLimbs;
    private int energyLevel = 100;


    public abstract void eat(String food);

    public abstract String reproduce(Animal parentAnimal);

    public abstract void move() throws InsufficientEnergy;

    public abstract String communicate();

    public String sleep(){
        String sleepNoise = "Snores";
        energyLevel = 100;

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

    public String getNoOfLimbs() {
        return noOfLimbs;
    }

    public void setNoOfLimbs(String noOfLimbs) {
        this.noOfLimbs = noOfLimbs;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", lastFoodEaten='" + lastFoodEaten + '\'' +
                ", noOfLimbs='" + noOfLimbs + '\'' +
                ", energyLevel=" + energyLevel +
                '}';
    }


}
