package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        //Printing the content using application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("Application Context");
        //movie1
        Movie movie1=applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1);

        //movie2
        Movie movie2=applicationContext.getBean("movie2",Movie.class);
        System.out.println(movie2);


        //Printing the content using XML bean factory
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));

        System.out.println("\n\nBean Factory");
        //movie1
        Movie beanFactoryMovie1=beanFactory.getBean("movie1",Movie.class);
        System.out.println(beanFactoryMovie1);

        //movie2
        Movie beanFactoryMovie2=beanFactory.getBean("movie2",Movie.class);
        System.out.println(beanFactoryMovie2);


        //Printing the content using BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(registry);

        System.out.println("\n\nBean Definition Registry");
        //movie1
        Movie mov1 = ((XmlBeanFactory)beanFactory).getBean("movie1", Movie.class);
        System.out.println(mov1);
        //movie
        Movie mov2 = ((XmlBeanFactory)beanFactory).getBean("movie2", Movie.class);
        System.out.println(mov2);
    }
}
