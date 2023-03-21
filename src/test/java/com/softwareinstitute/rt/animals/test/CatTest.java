package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CatTest {

    @Test
    public void testing_cat_communicate() {

        Cat cat = new Cat();

        assertEquals("Meow", cat.communicate(), "Incorrect Communication");

    }

    @Test
    public void testing_cat_eat(){

        Cat cat = new Cat();
        cat.eat("Cat food");

        assertNotEquals("Tuna",cat.getLastFoodEaten(),"The food should not match");

    }

    @Test
    public void testing_cat_reproduce(){

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        assertEquals("A live-birth of animal: Cat",cat.reproduce(cat1),"The message is not matching");



    }

}
