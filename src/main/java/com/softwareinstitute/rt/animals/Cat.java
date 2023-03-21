package com.softwareinstitute.rt.animals;


public class Cat extends Mammal{


    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

    }

    @Override
    public Animal reproduce(Animal parentAnimal) {
        return null;
    }

    /*@Override
    public void move() {

    }*/

    @Override
    public String communicate() {
        String catNoise = "Meow";

        return catNoise;

    }



  /*  @Override
    public Animal reproduce(Animal parentAnimal) {

        Cat cat = new Cat();

        return cat;

    }*/





}
