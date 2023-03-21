package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Bat;
import com.softwareinstitute.rt.animals.Cat;

import com.softwareinstitute.rt.exceptions.IncorrectGas;
import com.softwareinstitute.rt.exceptions.IncorrectParentAnimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {


    @Test
    void testing_cat_communicate() {

        Cat cat = new Cat("Rich", "Mary", 2);

        assertEquals("Meow", cat.communicate(), "Incorrect Communication");

    }

    @Test
    void testing_cat_eat() {

        Cat cat = new Cat("Rich", "Mary", 2);
        cat.eat("Cat food");

        assertNotEquals("Tuna", cat.getLastFoodEaten(), "The food should not match");

    }

    @Test
    void testing_cat_reproduce() throws IncorrectParentAnimal {

        Cat cat = new Cat("Rich", "Mary", 2);
        cat.setName("Tabby");
        Cat cat1 = new Cat("Harry", "Rose", 2);
        cat.setName("Lily");

        assertEquals("Lily", cat.reproduce(cat1).getMotherName(), "The name is not matching");

    }


    @Test
    void testing_animal_die() {
        Cat cat = new Cat("Rich", "Mary", 2);
        cat.setName("Tabby");
        cat.die();

        assertFalse(cat.isAlive());

    }


    @Test
    void testing_animal_breathe() throws IncorrectGas {
        Cat cat = new Cat("Rich", "Mary", 2);

        assertEquals("Breathes",cat.breathe("Oxygen"),"Incorrect gas supplied");

    }

    @Test
    void testing_animal_excretes(){
        Cat cat = new Cat("Rich", "Mary", 2);

        assertEquals("Feces",cat.excrete(),"Incorrect output");

    }




}
