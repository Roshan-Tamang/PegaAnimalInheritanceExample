package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PenguinTest {

    @Test
    void testing_penguin_communicate() {

        Penguin penguin = new Penguin("Rich", "Mary", 2);

        assertEquals("Honk", penguin.communicate(), "Incorrect Communication");

    }

    @Test
    void testing_penguin_eat() {

        Penguin penguin = new Penguin("Rich", "Mary", 2);
        penguin.eat("Fish");

        assertNotEquals("Cat food", penguin.getLastFoodEaten(), "The food should not match");

    }

    @Test
    void testing_animal_sleep() {

        Penguin penguin = new Penguin("Rich", "Mary", 2);

        assertEquals("Snore", penguin.sleep(), "The text should match");

    }

}
