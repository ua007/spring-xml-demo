package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Printing the content using application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("Application Context");

        //printing movie
        Movie movie=(Movie) applicationContext.getBean("movie",Movie.class);
        System.out.println(movie);

    }
}
