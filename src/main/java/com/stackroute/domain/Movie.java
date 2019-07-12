package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware {

    private Actor actor;
    private ApplicationContext context=null;


    public Movie() {
        this.actor=null;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor1(Actor actor1) {
        this.actor = actor1;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }
}
