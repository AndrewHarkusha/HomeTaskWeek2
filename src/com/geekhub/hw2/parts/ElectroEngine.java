package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

/**
 * Class for Electro Engine
 */
public class ElectroEngine implements Engine{

    @Override
    public Force transform(Energy energy){
        return new Force(energy.getAmount());
    }

}
