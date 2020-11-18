package io.dk.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("io.dk.bean");
        SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);

        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }
}
