package com.example.demo.parts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Chip")
public class Processor {

    @Autowired
    LogicGates logicgates;

    @Autowired
    Resistor resistor;

    public void makeProcessor()
    {
        System.out.println(logicgates.getALogicGate());
        System.out.println(resistor.getResistor());
        System.out.println("Assembled Processor");
    }
}
