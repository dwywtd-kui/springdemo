package com.haan.springdemo.annotation.beanleftcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author hanliukui
 * @Date 2021/4/14 20:48
 */
public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("cat constructor ...");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet...");
    }
}
