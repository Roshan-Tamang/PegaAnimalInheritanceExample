package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BatTest {

    @Test
    public void bat_communicate_test() {

        Bat bat = new Bat();

        assertEquals("Chirp", bat.communicate(), "Incorrect Communication");

    }

    @Test
    public void bat_eat_test(){

        Bat bat = new Bat();
        bat.eat("Berry");

        assertNotEquals("Cat food",bat.getLastFoodEaten(),"The food should not match");

    }



}
