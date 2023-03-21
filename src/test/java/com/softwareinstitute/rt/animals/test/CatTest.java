package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CatTest {

    @Test
    public void cat_communicate_test() {

        Cat cat = new Cat();

        assertEquals("Meow", cat.communicate(), "Incorrect Communication");

    }

    @Test
    public void cat_eat_test(){

        Cat cat = new Cat();
        cat.eat("Cat food");

        assertNotEquals("Tuna",cat.getLastFoodEaten(),"The food should not match");

    }


}
