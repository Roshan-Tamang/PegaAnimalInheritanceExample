package com.softwareinstitute.rt.animals;


import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;

public class Cat extends Mammal{


    public Cat(String fatherName, String motherName, int age) {
        super(fatherName, motherName, age);
    }

    @Override
    public void eat(String food) {

        this.setLastFoodEaten(food);

    }

    @Override
    public String communicate() {
        String catNoise = "Meow";

        return catNoise;
    }


    @Override
    public Animal reproduce(Animal parentAnimal) throws IncorrectParentAnimal {

        if(!parentAnimal.getClass().toString().equals(Cat.class.toString())){
            throw new IncorrectParentAnimal("Animals are of different type");
        }

        Cat cat = new Cat(parentAnimal.getName(),this.getName(),0);

        return cat;

    }





}
