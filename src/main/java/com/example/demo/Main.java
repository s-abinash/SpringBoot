package com.example.demo;

import com.example.demo.parts.Processor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.Config.Config;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("xmlConfig/Config.xml");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Processor processor= context.getBean("chip",Processor.class);
        processor.makeProcessor();
        context.close();
    }

}
