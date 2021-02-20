package com.example.demo;

import com.example.demo.parts.Processor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("xmlConfig/Config.xml");
        Processor processor= context.getBean("Chip",Processor.class);
        processor.makeProcessor();
        context.close();
    }

}
