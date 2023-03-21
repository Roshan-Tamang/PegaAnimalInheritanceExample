package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Crow;
import com.softwareinstitute.rt.animals.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PenguinTest {

    @Test
    public void penguin_communicate_test() {

        Penguin penguin = new Penguin();

        assertEquals("Honk", penguin.communicate(), "Incorrect Communication");

    }

    @Test
    public void penguin_eat_test(){

        Penguin penguin = new Penguin();
        penguin.eat("Fish");

        assertNotEquals("Cat food",penguin.getLastFoodEaten(),"The food should not match");

    }



}
