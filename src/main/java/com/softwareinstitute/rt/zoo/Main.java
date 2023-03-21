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

    }

    public static void createZoo() {

  /*      Cat tabby = new Cat();
        tabby.setName("Tabby");
        Cat whiskers = new Cat();
        whiskers.setName("Whiskers");

        animalList.add(tabby);
        animalList.add(whiskers);

        Bat alvin = new Bat();
        alvin.setName("Alvin");
        Bat ricky = new Bat();
        ricky.setName("Ricky");

        animalList.add(alvin);
        animalList.add(ricky);

        Crow richie = new Crow();
        richie.setName("Richie");
        Crow sam = new Crow();
        sam.setName("Sam");

        animalList.add(richie);
        animalList.add(sam);

        Penguin john = new Penguin();
        john.setName("John");
        Penguin karl = new Penguin();
        karl.setName("Karl");

        animalList.add(john);
        animalList.add(karl);*/

    }

    public static void checkAnimals() {

        System.out.println("The zoo contains:");
        for (Animal i :
                animalList) {
            System.out.println(i.getClass().toString().substring(39) + " " + i.toString());
        }

    }



}