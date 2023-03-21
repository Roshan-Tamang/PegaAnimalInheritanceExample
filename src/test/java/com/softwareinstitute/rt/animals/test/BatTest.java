package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BatTest {

    @Test
    void testing_bat_communicate() {

        Bat bat = new Bat();

        assertEquals("Chirp", bat.communicate(), "Incorrect Communication");

    }

    @Test
    void testing_bat_eat() {

        Bat bat = new Bat();
        bat.eat("Berry");

        assertNotEquals("Cat food", bat.getLastFoodEaten(), "The food should not match");

    }


}
