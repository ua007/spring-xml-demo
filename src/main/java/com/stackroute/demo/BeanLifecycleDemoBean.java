package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is afterPropertiesSet");
    }

    public String customInit(){
        return("This is customerInit ");
    }

    public String customDestroy(){
        return("This is customerDestroy");
    }

}
