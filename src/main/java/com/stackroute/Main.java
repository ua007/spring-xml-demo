package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Printing the content using application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("Application Context");

        //movie1
        Movie movie1=applicationContext.getBean("movie",Movie.class);
        System.out.println(movie1);

        //movie2
        Movie movie2=applicationContext.getBean("movieB",Movie.class);
        System.out.println(movie2);
        System.out.println(movie1==movie2);



    }
}
