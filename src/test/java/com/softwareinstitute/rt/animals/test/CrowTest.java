package com.softwareinstitute.rt.animals.test;

import com.softwareinstitute.rt.animals.Crow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CrowTest {


    @Test
     void testing_crow_communicate() {

        Crow crow = new Crow("Rich","Mary",2);

        assertEquals("Caw", crow.communicate(), "Incorrect Communication");

    }

    @Test
     void testing_crow_eat() {

        Crow crow = new Crow("Rich","Mary",2);
        crow.eat("Berry");

        assertNotEquals("Tuna", crow.getLastFoodEaten(), "The food should not match");

    }


}
