package com.example.demo.parts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("chip")
public class Processor {

    Resistor resistor;

    @Autowired
    LogicGates logicgates;

    @Autowired
    protected Processor(Resistor resistor){
        this.resistor=resistor;
    }

    @PostConstruct
    public void initializer()
    {
        System.out.println("Process Starting");
    }

    @PreDestroy
    public void destroyer()
    {
        System.out.println("Process Ending");
    }

    public void makeProcessor()
    {
        System.out.println(logicgates.getALogicGate());
        System.out.println(resistor.getResistor());
        System.out.println("Assembled Processor");
    }
}
