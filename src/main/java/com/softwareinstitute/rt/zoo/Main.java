package com.softwareinstitute.rt.zoo;

import com.softwareinstitute.rt.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Animal> animalList = new ArrayList<>();


    public static void main(String[] args) {

        createZoo();

        System.out.println("Check animals in the zoo");

        checkAnimals();


        Cat a = new Cat("A");
        a.eat("Cat food");

        System.out.println(a.getLastFoodEaten());


    }

    private static void createZoo() {

        Cat cat = new Cat("Tabby");
        Cat cat1 = new Cat("Ginger");

        animalList.add(cat);
        animalList.add(cat1);

        Bat bat = new Bat("Fly");
        Bat bat1 = new Bat("Batman");

        animalList.add(bat);
        animalList.add(bat1);

        Crow crow = new Crow("Caw");
        Crow crow1 = new Crow("CawCaw");

        animalList.add(crow);
        animalList.add(crow1);

        Penguin penguin = new Penguin("Pengu");
        Penguin penguin1 = new Penguin("Pingu");

        animalList.add(penguin);
        animalList.add(penguin1);

    }

    private static void checkAnimals() {

        System.out.println("The zoo contains:");
        for (Animal i:
             animalList) {
            System.out.println(i.getName() + i.getClass());
        }


    }
}