package com.softwareinstitute.rt.zoo;

import com.softwareinstitute.rt.animals.*;
import com.softwareinstitute.rt.exceptions.InsufficientEnergy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Animal> animalList = new ArrayList<>();


    public static void main(String[] args) {

        createZoo();

        System.out.println("Check animals in the zoo");

        checkAnimals();

    }

    public static void createZoo() {

        Cat tabby = new Cat();
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
        animalList.add(karl);

    }

    public static void checkAnimals() {

        System.out.println("The zoo contains:");
        for (Animal i :
                animalList) {
            System.out.println(i.getClass().toString().substring(39) + " " + i.toString());
        }

    }







/*    public static void moveAnimal() {

        Animal animal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select which animal will move: ");
        for (Animal i :
                animalList) {
            System.out.println(i.getClass().toString().substring(39) + " " + i.toString());
        }

        String userChoice = sc.nextLine();

        for (Animal i :
                animalList) {
            if (i.getName().equals(userChoice)) {
                animal = i;
                try {
                    i.move();
                } catch (InsufficientEnergy e) {
                    throw new RuntimeException(e);
                }
            }
        }

        animal.move();

    }*/


}