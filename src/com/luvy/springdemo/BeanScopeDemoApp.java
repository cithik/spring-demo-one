package com.luvy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load the spring config file
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve beans from spring container
        Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);


        //check if these are the same beans
        boolean result = (theCoach == alphaCoach);

        //print the result
        System.out.println("\nPointing to the same object: " +result);
        System.out.println("\nMemory location for theCoach: " +theCoach);
        System.out.println("\nMemory location for alphaCoach: " +alphaCoach);

        //close the context
        classPathXmlApplicationContext.close();
    }
}
