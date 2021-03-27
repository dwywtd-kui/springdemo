package com.haan.test01;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IAnimal {
    @Override
    public void say() {
        System.out.println("wang wang ~~~");
    }
}
