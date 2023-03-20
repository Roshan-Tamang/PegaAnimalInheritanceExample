package com.softwareinstitute.rt.animals;


public class Cat extends Mammal{

    //Variable


    //Constructor
    public Cat(String name){
        super(name);
    }


    //Methods


    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

    }

    @Override
    public String communicate() {
        String catNoise = "Meow";

        return catNoise;

    }


}
