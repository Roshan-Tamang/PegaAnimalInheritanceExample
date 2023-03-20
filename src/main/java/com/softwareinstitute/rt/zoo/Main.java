package com.softwareinstitute.rt.zoo;

import com.softwareinstitute.rt.animals.Animal;
import com.softwareinstitute.rt.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

List<Animal> animalList = new ArrayList<>();


    public static void main(String[] args) {

        createZoo();


        System.out.println("Check animals in the zoo");
        
        checkAnimals();
        
        
        Cat a = new Cat("A");
        a.eat("Cat food");

        System.out.println(a.getLastFoodEaten());


    }

    private static void checkAnimals() {




    }
}