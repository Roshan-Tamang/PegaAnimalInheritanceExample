package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Crow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CrowTest {


    @Test
    public void crow_communicate_test() {

        Crow crow = new Crow();

        assertEquals("Caw", crow.communicate(), "Incorrect Communication");

    }

    @Test
    public void crow_eat_test(){

        Crow crow = new Crow();
        crow.eat("Berry");

        assertNotEquals("Tuna",crow.getLastFoodEaten(),"The food should not match");

    }



}
