package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Crow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CrowTest {


    @Test
     void testing_crow_communicate() {

        Crow crow = new Crow();

        assertEquals("Caw", crow.communicate(), "Incorrect Communication");

    }

    @Test
     void testing_crow_eat() {

        Crow crow = new Crow();
        crow.eat("Berry");

        assertNotEquals("Tuna", crow.getLastFoodEaten(), "The food should not match");

    }

    @Test
     void testing_bird_reproduce() {

        Crow crow = new Crow();

        Crow crow1 = new Crow();

        assertEquals("An egg is laid: Crow", crow.reproduce(crow1), "The food should not match");

    }

}
