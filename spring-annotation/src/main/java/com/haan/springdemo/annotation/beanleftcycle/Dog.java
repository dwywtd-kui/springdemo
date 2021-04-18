package com.haan.springdemo.annotation.beanleftcycle;

/**
 * @author hanliukui
 * @Date 2021/4/14 20:25
 */
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("dog constructor ...");
    }

    public void init(){
        System.out.println("dog init ...");
    }

    public void destroy(){
        System.out.println("dog destroy ...");
    }
}
