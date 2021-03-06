package com.luvy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach=context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method for fortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyFortune());

        //call MyName
        System.out.println(theCoach.getMyName());

        //close the context
        context.close();
    }
}
