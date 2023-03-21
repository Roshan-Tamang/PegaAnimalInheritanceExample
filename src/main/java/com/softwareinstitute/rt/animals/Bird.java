package com.softwareinstitute.rt.animals;

import com.softwareinstitute.rt.exceptions.IncorrectGas;

public abstract class Bird extends Animal {

    public Bird(String fatherName, String motherName, int age) {
        super(fatherName, motherName, age);
    }

    @Override
    public String breathe(String oxygen) throws IncorrectGas {

        if (!oxygen.equals("Oxygen")) {
            throw new IncorrectGas("Wrong gas");
        }

        return "Breathes";

    }



}
