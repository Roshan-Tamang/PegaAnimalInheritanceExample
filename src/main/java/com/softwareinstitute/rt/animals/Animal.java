package com.softwareinstitute.rt.animals;


import com.softwareinstitute.rt.exceptions.IncorrectGas;
import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;

public abstract class Animal {

    private String name;
    private final String fatherName;
    private final String motherName;
    private int age;
    private String lastFoodEaten;
    private boolean alive = true;

    public Animal(String fatherName, String motherName, int age) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.age = age;
    }


    public abstract void eat(String food);

    public abstract Animal reproduce(Animal parentAnimal) throws IncorrectParentAnimal;

    public abstract String breathe(String oxygen) throws IncorrectGas;


    public abstract String communicate();

    public String sleep() {
        String sleepNoise = "Snores";

        return sleepNoise;

    }

    public void die() {
        alive = false;
    }

    public String excrete() {

        return "feces";
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

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
